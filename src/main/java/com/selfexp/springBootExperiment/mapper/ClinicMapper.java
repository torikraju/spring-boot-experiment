package com.selfexp.springBootExperiment.mapper;

import com.selfexp.springBootExperiment.dto.reqeust.SaveClinicRequestDto;
import com.selfexp.springBootExperiment.dto.response.SaveClinicResponseDto;
import com.selfexp.springBootExperiment.entity.sql.Clinic;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ClinicMapper {
    Clinic saveClinicRequestDtoToClinic(SaveClinicRequestDto requestDto);

    default void clinicToSaveClinicResponseDto(@MappingTarget SaveClinicResponseDto responseDto, Clinic clinic) {
        responseDto.setData(clinic);
    }

}
