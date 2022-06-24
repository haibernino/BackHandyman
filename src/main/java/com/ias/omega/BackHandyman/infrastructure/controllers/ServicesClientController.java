package com.ias.omega.BackHandyman.infrastructure.controllers;

import com.ias.omega.BackHandyman.services.aplication.services.QueryServicesAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
public class ServicesClientController {
    @Autowired
    private QueryServicesAll queryServicesAll;

    @GetMapping("/services")
    public ResponseEntity<?> getServices(){
        Map<String,Object> response = new HashMap<>();
        try{
            response.put("services",queryServicesAll.execute(1L));
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
        }
        catch(Exception e){
            response.put("msg",e.getMessage()+e.getLocalizedMessage());
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
