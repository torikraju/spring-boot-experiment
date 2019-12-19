package com.selfexp.springBootExperiment.resource;

import com.selfexp.springBootExperiment.entity.postgres.Doctor;
import com.selfexp.springBootExperiment.service.DoctorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/doctor")
public class DoctorController {

    private DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public Iterable<Doctor> getAll() {
        return doctorService.getAll();
    }
}
