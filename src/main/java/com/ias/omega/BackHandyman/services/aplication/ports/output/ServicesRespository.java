package com.ias.omega.BackHandyman.services.aplication.ports.output;

import com.ias.omega.BackHandyman.services.aplication.models.ServicesClient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServicesRespository extends JpaRepository<ServicesClient,Long>{

}
