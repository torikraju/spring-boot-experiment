package com.selfexp.springBootExperiment.mapper;

import com.selfexp.springBootExperiment.dto.reqeust.SaveClinicRequestDto;
import com.selfexp.springBootExperiment.entity.sql.Clinic;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClinicMapper {
    Clinic toClinic(SaveClinicRequestDto requestDto);
}
