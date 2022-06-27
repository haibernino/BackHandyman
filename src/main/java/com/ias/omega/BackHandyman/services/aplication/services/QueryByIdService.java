package com.ias.omega.BackHandyman.services.aplication.services;

import com.ias.omega.BackHandyman.infrastructure.exceptions.ResourceNotFoundException;
import com.ias.omega.BackHandyman.infrastructure.models.services.ServiceDTO;
import com.ias.omega.BackHandyman.services.aplication.ports.input.QueryByIdUseCase;
import com.ias.omega.BackHandyman.services.aplication.ports.output.ServicesRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QueryByIdService implements QueryByIdUseCase {
    @Autowired
    private ServicesRespository servicesRespository;

    @Override
    public Optional<ServiceDTO> execute(Long idService) {
         servicesRespository.findById(idService);

         /*if(serviceOptional.isPresent()) {
             return serviceOptional.map(servic->{
                 ServiceDTO serviceDTO = ServiceDTO.fromToDomain(servic);
                 return serviceDTO;
             });
         }*/
         return null;
    }

}
