package com.ias.omega.BackHandyman.services.aplication.ports.output;

import com.ias.omega.BackHandyman.services.aplication.models.ServicesClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;


public interface ServicesRespository extends JpaRepository<ServicesClient,Long>{

}
