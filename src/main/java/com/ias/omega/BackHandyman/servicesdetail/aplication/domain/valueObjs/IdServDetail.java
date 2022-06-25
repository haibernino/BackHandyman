package com.ias.omega.BackHandyman.servicesdetail.aplication.domain.valueObjs;

import org.apache.commons.lang3.Validate;

import javax.persistence.*;
import java.io.Serializable;

public class IdServDetail implements Serializable{

    private Long idServDetail;

    public IdServDetail(Long idServDetail) {
        Validate.notNull(idServDetail,"The id field cannot be empty or null.");
        this.idServDetail = idServDetail;
    }

    public Long getIdServDetail() {
        return idServDetail;
    }

    @Override
    public String toString() {
        return idServDetail.toString();
    }

    protected IdServDetail(){}
}
