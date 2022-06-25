package com.ias.omega.BackHandyman.services.aplication.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.ias.omega.BackHandyman.services.aplication.domain.valueObjs.*;
import com.ias.omega.BackHandyman.servicesdetail.aplication.models.ServicesDetail;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="services")

public class ServicesClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idService;

    @Column(name = "service_type")
    private String typeService;

    @Column(name = "journey_type")
    private String journeyTypeService;

    @Column(name = "address")
    private String addressService;

    @Column(name = "user")
    private Integer userService;


    @JsonBackReference
    @OneToMany(mappedBy = "servicesClient", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ServicesDetail> servicesDet = new HashSet<>();

    public Set<ServicesDetail> getServicesDet() {
        return servicesDet;
    }

    public void setServicesDet(Set<ServicesDetail> servicesDet) {
        this.servicesDet = servicesDet;
    }

    public ServicesClient() {}

    public ServicesClient(Long idService, String typeService, String journeyTypeService, String addressService, Integer userService) {
        this.idService = idService;
        this.typeService = typeService;
        this.journeyTypeService = journeyTypeService;
        this.addressService = addressService;
        this.userService = userService;
    }

    public Long getIdService() {
        return idService;
    }

    public void setIdService(Long idService) {
        this.idService = idService;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public String getJourneyTypeService() {
        return journeyTypeService;
    }

    public void setJourneyTypeService(String journeyTypeService) {
        this.journeyTypeService = journeyTypeService;
    }

    public String getAddressService() {
        return addressService;
    }

    public void setAddressService(String addressService) {
        this.addressService = addressService;
    }

    public Integer getUserService() {
        return userService;
    }

    public void setUserService(Integer userService) {
        this.userService = userService;
    }
}
