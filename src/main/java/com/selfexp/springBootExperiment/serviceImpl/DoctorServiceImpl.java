package com.selfexp.springBootExperiment.serviceImpl;

import com.selfexp.springBootExperiment.entity.postgres.Doctor;
import com.selfexp.springBootExperiment.repository.postgresRepository.DoctorRepository;
import com.selfexp.springBootExperiment.service.DoctorService;
import org.springframework.stereotype.Service;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Iterable<Doctor> getAll() {
        return doctorRepository.findAll();
    }
}
