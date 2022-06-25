package com.ias.omega.BackHandyman.infrastructure.controllers;

import com.ias.omega.BackHandyman.infrastructure.models.servicesDetail.ServiceDetailDTO;
import com.ias.omega.BackHandyman.servicesdetail.aplication.services.CreatedServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/servicesdetail")
public class ServiceDetailController {
    @Autowired
    private CreatedServiceDetail createdServiceDetail;

    @PostMapping
    public ResponseEntity<?> createdServiceDetail(@RequestBody ServiceDetailDTO serviceDetailDTO){
        Map<String,Object> response = new HashMap<>();
        try{
            response.put("services",createdServiceDetail.execute(serviceDetailDTO));
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
        }
        catch(Exception e){
            response.put("error",e);
            return new ResponseEntity<Map<String,Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
