package com.ias.omega.BackHandyman.servicesdetail.aplication.domain.valueObjs;

import org.apache.commons.lang3.Validate;

import javax.persistence.Column;

public class IdTechnicalServDetail {

    @Column(name="id_technical",nullable = false,length = 10)
    private String idTechnicalServDetail;

    public IdTechnicalServDetail(String idTechnicalServDetail) {
        Validate.notNull(idTechnicalServDetail,"The id_technical field cannot be empty or null.");
        Validate.isTrue(idTechnicalServDetail.toString().length() > 10,"The id_technical field cannot be empty or null.");
        this.idTechnicalServDetail = idTechnicalServDetail;
    }

    public String getIdTechnicalServDetail() {
        return idTechnicalServDetail;
    }

    @Override
    public String toString() {
        return idTechnicalServDetail.toString();
    }

    private IdTechnicalServDetail() {}
}
