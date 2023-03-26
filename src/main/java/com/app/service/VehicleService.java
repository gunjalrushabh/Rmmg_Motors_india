package com.app.service;

import java.util.List;

import com.app.pojos.Vehicle;

public interface VehicleService {

	Vehicle saveVehicle(Vehicle vehicle);

	void deleteProduct(Long id);

	List<Vehicle> findAllVehicles();
}
