package com.ias.omega.BackHandyman.infrastructure.controllers;

import com.ias.omega.BackHandyman.infrastructure.models.ApplicationError;
import com.ias.omega.BackHandyman.infrastructure.models.services.ServiceDTO;
import com.ias.omega.BackHandyman.services.aplication.services.CreatedService;
import com.ias.omega.BackHandyman.services.aplication.services.QueryByIdService;
import com.ias.omega.BackHandyman.services.aplication.services.QueryServicesAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class ServicesClientController {
    @Autowired
    private QueryServicesAll queryServicesAll;

    @Autowired
    private QueryByIdService queryByIdService;

    @Autowired
    private CreatedService createdService;

    @GetMapping("/services")
    public ResponseEntity<?> getServices(){
        Map<String,Object> response = new HashMap<>();
        try{
            response.put("services",queryServicesAll.execute(1L));
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
        }
        catch(Exception e){
            response.put("error",e);
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/services/{idService}")
    public ResponseEntity<?> getServiceById(@PathVariable(value = "idService") Long idService){
        Map<String,Object> response = new HashMap<>();
        try{
            response.put("service",queryByIdService.execute(idService));
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
        }
        catch(Exception e){
            response.put("error",e);
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/services")
    public ResponseEntity<?> createdService(@RequestBody ServiceDTO serviceDTO){
        Map<String,Object> response = new HashMap<>();
        try{
            ServiceDTO serviceDTO1 = createdService.execute(serviceDTO);
            response.put("service", serviceDTO1);
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
        }
        catch(IllegalArgumentException | NullPointerException ex){
            System.out.println("Entro in error");
            ApplicationError applicationError = new ApplicationError(
                    "InputDataValidationError",
                    "Bad input data",
                    Map.of("error", ex.getMessage()));

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(applicationError);
        }
        catch(Exception e){
            System.out.println("Entro in error 2");
            response.put("error",e);
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
