package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.pojos.Appointment;
import com.app.repository.AppointmentRepository;
import com.app.repository.projection.AppointmentForVehicle;

public interface AppointmentService {

	Appointment saveAppointment(Appointment appointment);
	
	//List<AppointmentForVehicle> findAppointmentOfUsers(Long userId);
}
