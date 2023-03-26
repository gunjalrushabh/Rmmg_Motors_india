package com.app.pojos;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="appointment_tbl")
public class Appointment extends BaseEntity {

	@Column(name="user_id", nullable = false)
	private Long userId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id",referencedColumnName = "id", insertable = false, updatable = false)
	private User user;
	
	@Column(name="vehicle_id",nullable = false)
	private Long vehicleId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="vehicle_id",referencedColumnName = "id", insertable = false, updatable = false)
	private Vehicle vehicle;
	
	@Column(name="price",nullable = false)
	private Double price;
	
	@Column(name="appointment_schedule",nullable = false)
	private LocalDateTime appointmentSchedule;

	@Override
	public String toString() {
		return "Appointment [userId=" + userId + ", user=" + user + ", vehicleId=" + vehicleId + ", vehicle=" + vehicle
				+ ", price=" + price + ", appointmentSchedule=" + appointmentSchedule + ", getId()=" + getId() + "]";
	}
	
	
	
}
