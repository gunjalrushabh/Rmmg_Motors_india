package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.pojos.Appointment;
import com.app.repository.projection.AppointmentForVehicle;


public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

//	@Query("select " +
//	
//			"v.vehicleName as name, apt.price as price, apt.appointmentSchedule as appointtime"
//			+
//			"from Appointment apt left join Vehicle v on v.id=apt.vehicleId"
//			+
//			"where apt.userId = :userId")
//	List<AppointmentForVehicle> findAllAppointmentOfUsers(@Param("userId") Long userId);
}
