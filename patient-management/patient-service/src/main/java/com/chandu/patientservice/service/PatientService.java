package com.chandu.patientservice.service;

import com.chandu.patientservice.dto.PatientRequestDTO;
import com.chandu.patientservice.dto.PatientResponseDTO;
import com.chandu.patientservice.mapper.PatientMapper;
import com.chandu.patientservice.model.Patient;
import com.chandu.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {


    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    public List<PatientResponseDTO> getAllPatients(){
        List<Patient> patients = patientRepository.findAll();
        return patients.stream()
                .map(PatientMapper::toDto).toList();
    }


    public PatientResponseDTO addPatient(PatientRequestDTO patientRequestDTO){
        Patient newPatient= patientRepository.save(PatientMapper.toModel(patientRequestDTO));
        return PatientMapper.toDto(newPatient);

    }


}
