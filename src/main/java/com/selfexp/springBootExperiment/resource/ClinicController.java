package com.selfexp.springBootExperiment.resource;

import com.selfexp.springBootExperiment.dto.reqeust.SaveClinicRequestDto;
import com.selfexp.springBootExperiment.dto.response.SaveClinicResponseDto;
import com.selfexp.springBootExperiment.entity.sql.Clinic;
import com.selfexp.springBootExperiment.service.ClinicService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clinic")
public class ClinicController {
    private ClinicService clinicService;

    public ClinicController(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    @GetMapping
    public Iterable<Clinic> getAll() {
        return clinicService.getAll();
    }

    @PostMapping("/save")
    public SaveClinicResponseDto save(@RequestBody SaveClinicRequestDto requestDto) {
        return clinicService.save(requestDto);
    }

}
