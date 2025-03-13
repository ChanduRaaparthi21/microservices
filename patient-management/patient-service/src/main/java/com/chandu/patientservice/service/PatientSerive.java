package com.chandu.patientservice.service;

import com.chandu.patientservice.dto.PatientResponseDTO;
import com.chandu.patientservice.mapper.PatientMapper;
import com.chandu.patientservice.model.Patient;
import com.chandu.patientservice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientSerive {


    @Autowired
    private  PatientRepository patientRepository;

    public PatientSerive(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    public List<PatientResponseDTO> getAllPatients(){
        List<Patient> patients = patientRepository.findAll();

        return patients.stream()
                .map(PatientMapper::toDto).toList();
    }


}
