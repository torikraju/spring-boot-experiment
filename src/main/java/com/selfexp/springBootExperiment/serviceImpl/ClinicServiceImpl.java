package com.selfexp.springBootExperiment.serviceImpl;

import com.selfexp.springBootExperiment.dto.reqeust.SaveClinicRequestDto;
import com.selfexp.springBootExperiment.dto.response.SaveClinicResponseDto;
import com.selfexp.springBootExperiment.entity.sql.Clinic;
import com.selfexp.springBootExperiment.mapper.ClinicMapper;
import com.selfexp.springBootExperiment.repository.sqlRepository.ClinicRepository;
import com.selfexp.springBootExperiment.service.ClinicService;
import org.springframework.stereotype.Service;

@Service
public class ClinicServiceImpl implements ClinicService {

    private final ClinicRepository clinicRepository;
    private final ClinicMapper clinicMapper;


    public ClinicServiceImpl(ClinicRepository clinicRepository, ClinicMapper clinicMapper) {
        this.clinicRepository = clinicRepository;
        this.clinicMapper = clinicMapper;
    }

    @Override
    public Iterable<Clinic> getAll() {
        return clinicRepository.findAll();
    }

    @Override
    public SaveClinicResponseDto save(SaveClinicRequestDto requestDto) {
//        Clinic clinic = ClinicMapper.INSTANCE.saveResponseToEntity(requestDto);
        //TODO need to convert dto to entity
        //TODO save to db
        //TODO convert entity to dto
        //TODO return responseDto
        return null;
    }
}
