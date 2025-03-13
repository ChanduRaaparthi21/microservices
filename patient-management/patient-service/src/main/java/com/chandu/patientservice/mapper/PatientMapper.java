package com.chandu.patientservice.mapper;

import com.chandu.patientservice.dto.PatientResponseDTO;
import com.chandu.patientservice.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO toDto(Patient patient){
         PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
         patientResponseDTO.setId(patient.getId().toString());
         patientResponseDTO.setName(patient.getName());
         patientResponseDTO.setAddress(patient.getAddress());
         patientResponseDTO.setEmail(patient.getEmail());
         patientResponseDTO.setDateOfBirth(patient.getDateOfBirth().toString());

         return patientResponseDTO;

    }
}
