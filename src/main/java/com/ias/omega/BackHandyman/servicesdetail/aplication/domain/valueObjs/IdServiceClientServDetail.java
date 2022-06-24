package com.ias.omega.BackHandyman.servicesdetail.aplication.domain.valueObjs;

import org.apache.commons.lang3.Validate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class IdServiceClientServDetail {
    @Column(name="id_service",nullable = false, length = 11)
    private Number idServiceClientServDetail;

    public IdServiceClientServDetail(Number idServiceClientServDetail) {
        Validate.notNull(idServiceClientServDetail,"The id_service field cannot be empty or null.");
        Validate.isTrue(idServiceClientServDetail.toString().length() > 11,"The id_service field cannot be empty or null.");
        this.idServiceClientServDetail = idServiceClientServDetail;
    }

    public Number getIdServiceClientServDetail() {
        return idServiceClientServDetail;
    }

    @Override
    public String toString() {
        return idServiceClientServDetail.toString();
    }

    protected IdServiceClientServDetail(){}
}
