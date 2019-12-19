package com.selfexp.springBootExperiment.dto.reqeust;

import lombok.Data;

@Data
public class SaveClinicRequestDto {
    private String name;
    private String city;
    private String streetAddress;

}
