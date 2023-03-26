package com.app.repository.projection;

import java.time.LocalDateTime;

public interface AppointmentForVehicle {

	String getName();
	
	Double getPrice();
	
	LocalDateTime getAppointTime();
}
//this is projection interface only geetter are there callining in appointment repo as allias 
//29
//29