package com.app.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Appointment;
import com.app.repository.AppointmentRepository;
import com.app.repository.projection.AppointmentForVehicle;

@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepo;

	@Override
	public Appointment saveAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		appointment.setAppointmentSchedule(LocalDateTime.now());
		return appointmentRepo.save(appointment);
	}

//	@Override
//	public List<AppointmentForVehicle> findAppointmentOfUsers(Long userId) {
//		// TODO Auto-generated method stub
//		
//		return appointmentRepo.findAllAppointmentOfUsers(userId);
//	}
//	
	 
	
	
}
