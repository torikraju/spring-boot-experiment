package com.selfexp.springBootExperiment.repository.postgresRepository;

import com.selfexp.springBootExperiment.entity.postgres.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
