package com.ias.omega.BackHandyman.servicesdetail.aplication.domain.valueObjs;

import org.apache.commons.lang3.Validate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Embeddable
public class IdServDetail {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id",nullable = false ,length = 11)
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
