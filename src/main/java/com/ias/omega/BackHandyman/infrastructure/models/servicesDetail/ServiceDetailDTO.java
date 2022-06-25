package com.ias.omega.BackHandyman.infrastructure.models.servicesDetail;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ias.omega.BackHandyman.servicesdetail.aplication.domain.valueObjs.*;
import com.ias.omega.BackHandyman.servicesdetail.aplication.models.ServicesDetail;

import java.util.Date;

public class ServiceDetailDTO {

    private Long idServDetail;

    private String idTechnicalServDetail;

    private Long idServiceClientServDetail;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startDateServDetail;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endDateServDetail;

    private Number statusServDetail;

    public ServiceDetailDTO() {
    }

    public ServiceDetailDTO(Long idServDetail, String idTechnicalServDetail, Long idServiceClientServDetail, Date startDateServDetail, Date endDateServDetail, Number statusServDetail) {
        this.idServDetail = idServDetail;
        this.idTechnicalServDetail = idTechnicalServDetail;
        this.idServiceClientServDetail = idServiceClientServDetail;
        this.startDateServDetail = startDateServDetail;
        this.endDateServDetail = endDateServDetail;
        this.statusServDetail = statusServDetail;
    }

    public static ServiceDetailDTO fromToDomain(ServicesDetail serviceDetail){
        ServiceDetailDTO serviceDetailDTO = new ServiceDetailDTO();
        /*serviceDetailDTO.setIdServDetail(serviceDetail.getIdServDetail().getIdServDetail());
        serviceDetailDTO.setIdServiceClientServDetail(serviceDetail.getIdServiceClientServDetail().getIdServiceClientServDetail());
        /*serviceDetailDTO.setTypeService(service.getTypeService().getValue());
        serviceDetailDTO.setJourneyTypeService(service.getJourneyTypeService().getValue());
        serviceDetailDTO.setAddressService(service.getAddressService().getValue());
        serviceDetailDTO.setUserService(service.getUserService().getValue());*/
        return serviceDetailDTO;
    }

    public ServicesDetail toUnsaveDomain(){
        //System.out.println(idTechnicalServDetail+" - "+idServiceClientServDetail);
        return new ServicesDetail(
                null,
                new IdTechnicalServDetail("1152197700"/*idTechnicalServDetail*/),
                new IdServiceClientServDetail(1L/*idServiceClientServDetail*/),
                new StartDateServDetail(new Date("2020-01-01 12:00:00")/*startDateServDetail*/),
                new EndDateServDetail(new Date("2020-01-01 12:00:00")/*endDateServDetail*/),
                new StatusServDetail(0/*statusServDetail*/)
        );
    }

    public Long getIdServDetail() {
        return idServDetail;
    }

    public void setIdServDetail(Long idServDetail) {
        this.idServDetail = idServDetail;
    }

    public String getIdTechnicalServDetail() {
        return idTechnicalServDetail;
    }

    public void setIdTechnicalServDetail(String idTechnicalServDetail) {
        this.idTechnicalServDetail = idTechnicalServDetail;
    }

    public Long getIdServiceClientServDetail() {
        return idServiceClientServDetail;
    }

    public void setIdServiceClientServDetail(Long idServiceClientServDetail) {
        this.idServiceClientServDetail = idServiceClientServDetail;
    }

    public Date getStartDateServDetail() {
        return startDateServDetail;
    }

    public void setStartDateServDetail(Date startDateServDetail) {
        this.startDateServDetail = startDateServDetail;
    }

    public Date getEndDateServDetail() {
        return endDateServDetail;
    }

    public void setEndDateServDetail(Date endDateServDetail) {
        this.endDateServDetail = endDateServDetail;
    }

    public Number getStatusServDetail() {
        return statusServDetail;
    }

    public void setStatusServDetail(Number statusServDetail) {
        this.statusServDetail = statusServDetail;
    }
}
