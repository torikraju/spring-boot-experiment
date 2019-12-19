package com.selfexp.springBootExperiment.entity.sql;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "CLINICS")
@Data
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "city")
    private String city;
    @Column(name = "street_address")
    private String streetAddress;

}
