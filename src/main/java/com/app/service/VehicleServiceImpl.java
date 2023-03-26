package com.app.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Vehicle;
import com.app.repository.VehicleRepository;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService{

	@Autowired
	private VehicleRepository vehiclerepo;

	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		
		vehicle.setLaunchedDate(LocalDateTime.now());
 		return vehiclerepo.save(vehicle);
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		vehiclerepo.deleteById(id);
	}

	@Override
	public List<Vehicle> findAllVehicles() {
		
		return vehiclerepo.findAll();
	}
	

}
