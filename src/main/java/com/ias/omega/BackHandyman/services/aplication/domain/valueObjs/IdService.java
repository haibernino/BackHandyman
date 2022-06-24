package com.ias.omega.BackHandyman.services.aplication.domain.valueObjs;

import org.apache.commons.lang3.Validate;

import javax.persistence.*;
import java.io.Serializable;


@Embeddable
public class IdService implements Serializable {

    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",length = 11)
    private Long idService;

    public IdService(Long idService) {
        Validate.notNull(idService,"The id service field cannot be empty or null.");
        Validate.isTrue(idService.toString().length() > 10,"The maximum id service size is 11 characters.");
        this.idService = idService;
    }
    public Long getValue() {
        return idService;
    }

    @Override
    public String toString() {
        return idService.toString();
    }

    protected IdService() {
    }
}
