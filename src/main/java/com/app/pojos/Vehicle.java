package com.app.pojos;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="vehicles_tbl")
public class Vehicle extends BaseEntity {

	@Column(name="vehicle_name", nullable = false)
	private String vehicleName;/////////
	
	@Column(name="price", nullable = false)
	private Double price;/////////
	
	@Column(name="vehicle_power")
	private String vehiclePower; //HP
	
	@Column(name="vehicle_torque")
	private String vehicleTorque;
	
	@Column(name="engine_displacement")
	private String EngineDisplacement; //CC
	
	@Column(name="fuel_type")
	private String FuelType;
	
	@Column(name="launche_dDate", nullable = false)
	private LocalDateTime launchedDate;//////////

	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", price=" + price + ", vehiclePower=" + vehiclePower
				+ ", vehicleTorque=" + vehicleTorque + ", EngineDisplacement=" + EngineDisplacement + ", FuelType="
				+ FuelType + ", launchedDate=" + launchedDate + ", getId()=" + getId() + "]";
	}
	
	
	
//	@OneToMany(fetch = FetchType.LAZY,mappedBy = "vehicle")
//	private Set<Appointment> appointmentLists;
	
}
