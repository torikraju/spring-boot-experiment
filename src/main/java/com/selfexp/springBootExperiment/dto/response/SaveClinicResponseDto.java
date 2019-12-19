package com.selfexp.springBootExperiment.dto.response;


import com.selfexp.springBootExperiment.entity.sql.Clinic;
import lombok.Data;

@Data
public class SaveClinicResponseDto {
    private boolean status;
    private String message;
    private Clinic data;
}
