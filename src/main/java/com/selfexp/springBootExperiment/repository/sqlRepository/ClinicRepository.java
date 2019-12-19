package com.selfexp.springBootExperiment.repository.sqlRepository;

import com.selfexp.springBootExperiment.entity.sql.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicRepository extends JpaRepository<Clinic, Long> {
}
