package com.selfexp.springBootExperiment.service;

import com.selfexp.springBootExperiment.entity.postgres.Doctor;

public interface DoctorService {

    Iterable<Doctor> getAll();
}
