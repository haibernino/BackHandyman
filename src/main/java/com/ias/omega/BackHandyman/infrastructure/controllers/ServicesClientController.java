package com.ias.omega.BackHandyman.infrastructure.controllers;

import com.ias.omega.BackHandyman.services.aplication.services.QueryByIdService;
import com.ias.omega.BackHandyman.services.aplication.services.QueryServicesAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class ServicesClientController {
    @Autowired
    private QueryServicesAll queryServicesAll;

    @Autowired
    private QueryByIdService queryByIdService;

    @GetMapping("/services")
    public ResponseEntity<?> getServices(){
        Map<String,Object> response = new HashMap<>();
        response.put("services",queryServicesAll.execute(1L));
        return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
    }

    @GetMapping("/services/{idService}")
    public ResponseEntity<?> getServiceById(@PathVariable(value = "idService") Long idService){
        Map<String,Object> response = new HashMap<>();
        response.put("service",queryByIdService.execute(idService));
        return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
    }
}
