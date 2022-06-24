package com.ias.omega.BackHandyman.services.aplication.models;

import com.ias.omega.BackHandyman.services.aplication.domain.valueObjs.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="services")

public class ServicesClient {

    @EmbeddedId
    private IdService idService;

    @Embedded
    private TypeService typeService;

    @Embedded
    private JourneyTypeService journeyTypeService;

    @Embedded
    private AddressService addressService;

    @Embedded
    private UserService userService;

    public ServicesClient() {
    }

    public ServicesClient(IdService idService, TypeService typeService, JourneyTypeService journeyTypeService, AddressService addressService, UserService userService) {
        this.idService = idService;
        this.typeService = typeService;
        this.journeyTypeService = journeyTypeService;
        this.addressService = addressService;
        this.userService = userService;
    }

    public IdService getIdService() {
        return idService;
    }

    public void setIdService(IdService idService) {
        this.idService = idService;
    }

    public TypeService getTypeService() {
        return typeService;
    }

    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }

    public JourneyTypeService getJourneyTypeService() {
        return journeyTypeService;
    }

    public void setJourneyTypeService(JourneyTypeService journeyTypeService) {
        this.journeyTypeService = journeyTypeService;
    }

    public AddressService getAddressService() {
        return addressService;
    }

    public void setAddressService(AddressService addressService) {
        this.addressService = addressService;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
