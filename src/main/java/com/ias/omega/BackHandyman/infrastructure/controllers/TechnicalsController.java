package com.ias.omega.BackHandyman.infrastructure.controllers;

import com.ias.omega.BackHandyman.infrastructure.models.technicals.TechnicalDTO;
import com.ias.omega.BackHandyman.technicals.aplication.models.Technicals;
import com.ias.omega.BackHandyman.technicals.aplication.ports.input.QueryAllTechnicals;
import com.ias.omega.BackHandyman.technicals.aplication.ports.input.QueryByIdTechnical;
import com.ias.omega.BackHandyman.technicals.aplication.services.QueryTechnicalsAllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api")
@CrossOrigin(origins = { "http://localhost:4200" })
public class TechnicalsController {

    @Autowired
    private QueryTechnicalsAllService queryTechnicalsAllService;

    @Autowired
    private QueryByIdTechnical queryByIdTechnical;

    @GetMapping("/technicals")
    public ResponseEntity<?> getTechnicals(){
        Map<String,Object> response = new HashMap<>();
        response.put("technicals",queryTechnicalsAllService.execute(0L));
        return new ResponseEntity<Map<String,Object>>(response, HttpStatus.OK);
    }

}
