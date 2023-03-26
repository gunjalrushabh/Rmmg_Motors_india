package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Appointment;
import com.app.security.UserPrinciple;
import com.app.service.AppointmentService;

@RestController
@RequestMapping("api/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	@PostMapping //api/appointment
	public ResponseEntity<?> saveAppointment(@RequestBody Appointment appointment)
	{
		return new ResponseEntity<>(appointmentService.saveAppointment(appointment),HttpStatus.CREATED);
	}
	
//	@GetMapping
//	public ResponseEntity<?> getAllAppointmentOfUser(@AuthenticationPrincipal UserPrinciple userPrinciple)
//	{
//		return ResponseEntity.ok(appointmentService.findAppointmentOfUsers(userPrinciple.getId()));
//	}
}
