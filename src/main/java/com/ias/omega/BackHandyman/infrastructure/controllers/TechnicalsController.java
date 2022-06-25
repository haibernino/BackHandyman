package com.ias.omega.BackHandyman.infrastructure.controllers;

import com.ias.omega.BackHandyman.infrastructure.models.technicals.TechnicalDTO;
import com.ias.omega.BackHandyman.technicals.aplication.models.Technicals;
import com.ias.omega.BackHandyman.technicals.aplication.ports.input.QueryAllTechnicals;
import com.ias.omega.BackHandyman.technicals.aplication.ports.input.QueryByIdTechnical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class TechnicalsController {

    @Autowired
    private QueryAllTechnicals queryAllTechnicals;

    @Autowired
    private QueryByIdTechnical queryByIdTechnical;

    @GetMapping("/queryAllTechnicals")
    public ResponseEntity<?> queryAllTechnicals(){
        List<TechnicalDTO> technicalsList = queryAllTechnicals.execute(1L);
        //List<TechnicalDTO> technicalDTOList = TechnicalDTO.fromToDomain(technicalsList);
        return ResponseEntity.ok().body(technicalsList);
    }
    /*
    @GetMapping("/queryByIdTechnical/{id}")
    public ResponseEntity<?> queryByIdTechnical(@PathVariable("id") Long idTechnical){
        Technicals technicals = queryByIdTechnical(idTechnical);
        return ResponseEntity.ok(TechnicalDTO.fromToDomain(technicals));

    }
    */

}
