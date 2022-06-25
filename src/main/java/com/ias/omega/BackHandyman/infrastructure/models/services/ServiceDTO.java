package com.ias.omega.BackHandyman.infrastructure.models.services;

import com.ias.omega.BackHandyman.services.aplication.domain.valueObjs.*;
import com.ias.omega.BackHandyman.services.aplication.models.ServicesClient;

public class ServiceDTO {

    private IdService idService;

    private TypeService typeService;

    private JourneyTypeService journeyTypeService;

    private AddressService addressService;

    private UserService userService;

    public ServiceDTO() {
    }

    public ServiceDTO(IdService idService, TypeService typeService, JourneyTypeService journeyTypeService, AddressService addressService, UserService userService) {
        this.idService = idService;
        this.typeService = typeService;
        this.journeyTypeService = journeyTypeService;
        this.addressService = addressService;
        this.userService = userService;
    }

    public ServicesClient toDomain(){
        ServicesClient servicesClient = new ServicesClient();
        servicesClient.setIdService(idService.getValue());
        servicesClient.setTypeService(typeService.getValue());
        servicesClient.setJourneyTypeService(journeyTypeService.getValue());
        servicesClient.setAddressService(addressService.getValue());
        servicesClient.setUserService(userService.getValue());
        return servicesClient;
    }

    public ServicesClient withoutSaveDomain(){
        ServicesClient servicesClient = new ServicesClient();
        servicesClient.setIdService(0L);
        servicesClient.setTypeService(typeService.getValue());
        servicesClient.setJourneyTypeService(journeyTypeService.getValue());
        servicesClient.setAddressService(addressService.getValue());
        servicesClient.setUserService(userService.getValue());
        return servicesClient;
    }

    public static ServiceDTO fromToDomain(ServicesClient service){
        ServiceDTO serviceDTO = new ServiceDTO();
        serviceDTO.setIdService(new IdService(service.getIdService().longValue()));
        serviceDTO.setTypeService(new TypeService(service.getTypeService()));
        serviceDTO.setJourneyTypeService(new JourneyTypeService(service.getJourneyTypeService()));
        serviceDTO.setAddressService(new AddressService(service.getAddressService()));
        serviceDTO.setUserService(new UserService(service.getUserService()));
        return serviceDTO;
    }

    public Long getIdService() {
        return idService.getValue();
    }

    public void setIdService(IdService idService) {
        this.idService = idService;
    }

    public String getTypeService() {
        return typeService.getValue();
    }

    public void setTypeService(TypeService typeService) {
        this.typeService = typeService;
    }

    public String getJourneyTypeService() {
        return journeyTypeService.getValue();
    }

    public void setJourneyTypeService(JourneyTypeService journeyTypeService) {
        this.journeyTypeService = journeyTypeService;
    }

    public String getAddressService() {
        return addressService.getValue();
    }

    public void setAddressService(AddressService addressService) {
        this.addressService = addressService;
    }

    public Integer getUserService() {
        return userService.getValue();
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
