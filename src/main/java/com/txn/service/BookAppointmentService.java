package com.txn.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.txn.controller.dto.AppointmentFormDto;
import com.txn.entity.Appointment;
import com.txn.entity.Patient;
import com.txn.repo.AppointmentRepo;
import com.txn.repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class BookAppointmentService {

    @Autowired
    private PatientRepo patientRepo;

    @Autowired
    private AppointmentRepo appointmentRepo;

    public String bookAppointment(AppointmentFormDto appointmentFormDto) {
        Patient patient = new ObjectMapper().convertValue(appointmentFormDto, Patient.class);
        Long patientNo = patientRepo.save(patient).getPatientNo();
        System.out.println(">>>>>>>>>patient saved successfully!!!<<<<<<<<<");


        System.out.println(10 / 0);
        Appointment appointment = Appointment.builder()
                .date(new Date(System.currentTimeMillis()))
                .doctorNo(101l)
                .patientNo(patientNo)
                .build();
        Long appointmentNo = appointmentRepo.save(appointment).getAppointmentNo();

        return "Appointment booked successfully!! with : " + appointmentNo;
    }
}























