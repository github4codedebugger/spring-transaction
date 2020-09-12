package com.txn.controller;

import com.txn.controller.dto.AppointmentFormDto;
import com.txn.service.BookAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookAppointmentController {


    @Autowired
    private BookAppointmentService bookAppointmentService;

    @PostMapping("/book")
    public String bookAppointment(@RequestBody AppointmentFormDto appointmentFormDto) {
        return bookAppointmentService.bookAppointment(appointmentFormDto);
    }
}
