package com.ias.omega.BackHandyman.servicesdetail.aplication.ports.output;

import com.ias.omega.BackHandyman.servicesdetail.aplication.models.ServicesDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceDetailRepository extends JpaRepository<ServicesDetail,Long> {
}
