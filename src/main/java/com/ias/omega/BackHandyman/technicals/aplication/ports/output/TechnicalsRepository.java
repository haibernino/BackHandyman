package com.ias.omega.BackHandyman.technicals.aplication.ports.output;

import com.ias.omega.BackHandyman.technicals.aplication.models.Technicals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalsRepository extends JpaRepository<Technicals, Long> {

}
