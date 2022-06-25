package com.ias.omega.BackHandyman.technicals.aplication.models;

import com.ias.omega.BackHandyman.technicals.aplication.domain.valueObjs.IdTechnical;
import com.ias.omega.BackHandyman.technicals.aplication.domain.valueObjs.NameTechnical;
import com.ias.omega.BackHandyman.technicals.aplication.domain.valueObjs.TypeDocumentTechnical;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="technicals")
public class Technicals {

    @EmbeddedId
    private IdTechnical idTechnical;

    @Embedded
    private NameTechnical nameTechnical;

    @Embedded
    private TypeDocumentTechnical typeDocumentTechnical;

    public Technicals() {
    }

    public Technicals(IdTechnical idTechnical, NameTechnical nameTechnical, TypeDocumentTechnical typeDocumentTechnical) {
        this.idTechnical = idTechnical;
        this.nameTechnical = nameTechnical;
        this.typeDocumentTechnical = typeDocumentTechnical;
    }

    public IdTechnical getIdTechnical() {
        return idTechnical;
    }

    public void setIdTechnical(IdTechnical idTechnical) {
        this.idTechnical = idTechnical;
    }

    public NameTechnical getNameTechnical() {
        return nameTechnical;
    }

    public void setNameTechnical(NameTechnical nameTechnical) {
        this.nameTechnical = nameTechnical;
    }

    public TypeDocumentTechnical getTypeDocumentTechnical() {
        return typeDocumentTechnical;
    }

    public void setTypeDocumentTechnical(TypeDocumentTechnical typeDocumentTechnical) {
        this.typeDocumentTechnical = typeDocumentTechnical;
    }

    @Override
    public String toString() {
        return "Technicals{" +
                "idTechnical=" + idTechnical +
                ", nameTechnical=" + nameTechnical +
                ", typeDocumentTechnical=" + typeDocumentTechnical +
                '}';
    }
}


