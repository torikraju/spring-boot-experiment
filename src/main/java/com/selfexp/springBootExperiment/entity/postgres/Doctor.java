package com.selfexp.springBootExperiment.entity.postgres;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "DOCTORS")
@Data
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "specialization")
    private String specialization;

}
