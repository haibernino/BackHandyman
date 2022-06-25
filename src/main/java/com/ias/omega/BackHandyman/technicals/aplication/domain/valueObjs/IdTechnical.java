package com.ias.omega.BackHandyman.technicals.aplication.domain.valueObjs;

import org.apache.commons.lang3.Validate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Embeddable
public class IdTechnical implements Serializable {

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id",length = 11)
    private Long IdTechnical;

    public IdTechnical(Long idTechnical) {
        Validate.notNull(idTechnical,"The id technical field cannot be empty or null.");
        Validate.isTrue(idTechnical.toString().length() > 10,"The maximum id technical size is 11 characters.");
        this.IdTechnical = idTechnical;
    }

    public Long getIdTechnical() {
        return IdTechnical;
    }

    @Override
    public String toString() {
        return IdTechnical.toString();
    }

    protected IdTechnical(){
    }
}
