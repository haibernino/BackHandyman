package com.ias.omega.BackHandyman.servicesdetail.aplication.domain.valueObjs;

import org.apache.commons.lang3.Validate;

import javax.persistence.Column;

public class StatusServDetail {

    @Column(name="status", columnDefinition = "tinyint(1) default '0'")
    private Number statusServDetail;

    public StatusServDetail(Number statusServDetail) {
        Validate.notNull(statusServDetail,"The status field cannot be empty or null.");
        this.statusServDetail = statusServDetail;
    }

    public Number getStatusServDetail() {
        return statusServDetail;
    }

    @Override
    public String toString() {
        return statusServDetail.toString();
    }

    private StatusServDetail() {
    }
}
