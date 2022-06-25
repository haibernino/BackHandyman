package com.ias.omega.BackHandyman.servicesdetail.aplication.services;

import com.ias.omega.BackHandyman.infrastructure.adapters.output.ServiceDetailsRepository;
import com.ias.omega.BackHandyman.infrastructure.models.servicesDetail.ServiceDetailDTO;
import com.ias.omega.BackHandyman.servicesdetail.aplication.domain.valueObjs.IdTechnicalServDetail;
import com.ias.omega.BackHandyman.servicesdetail.aplication.models.ServicesDetail;
import com.ias.omega.BackHandyman.servicesdetail.aplication.ports.input.CreatedServiceDetailUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatedServiceDetail implements CreatedServiceDetailUseCase {
    @Autowired
    private ServiceDetailsRepository serviceDetailRepository;

    @Override
    public ServiceDetailDTO execute(ServiceDetailDTO serviceDetailDTO) {
        ServicesDetail servicesDetail = new ServicesDetail();
        servicesDetail.setIdServDetail(null);
        servicesDetail.setIdTechnicalServDetail(new IdTechnicalServDetail("1152197700"));
        serviceDetailRepository.save(serviceDetailDTO.toUnsaveDomain());
        return serviceDetailDTO;
    }
}
