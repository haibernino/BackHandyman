package com.ias.omega.BackHandyman.services.aplication.ports.output;

import com.ias.omega.BackHandyman.infrastructure.models.services.ServiceDTO;
import com.ias.omega.BackHandyman.services.aplication.models.ServicesClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface ServicesRespository extends JpaRepository<ServicesClient,Long>{

    @Query(nativeQuery = true,value="select * from services  where id = ?1")
    public Optional<ServicesClient> queryById(Long id);
}
