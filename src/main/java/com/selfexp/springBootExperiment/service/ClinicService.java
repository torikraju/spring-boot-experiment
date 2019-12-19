package com.selfexp.springBootExperiment.service;

import com.selfexp.springBootExperiment.dto.reqeust.SaveClinicRequestDto;
import com.selfexp.springBootExperiment.dto.response.SaveClinicResponseDto;
import com.selfexp.springBootExperiment.entity.sql.Clinic;

public interface ClinicService {
    Iterable<Clinic> getAll();

    SaveClinicResponseDto save(SaveClinicRequestDto requestDto);
}
