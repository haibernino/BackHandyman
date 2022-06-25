package com.ias.omega.BackHandyman.technicals.aplication.ports.input;

import com.ias.omega.BackHandyman.technicals.aplication.models.Technicals;

public interface QueryByIdTechnical {

    Technicals queryById(Long idTechnicals);
}
