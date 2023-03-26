package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Vehicle;
import com.app.service.VehicleService;

@RestController
@RequestMapping("api/vehicle")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@PostMapping //api/vehicle
	public ResponseEntity<?> saveVehicle(@RequestBody Vehicle vehicle)
	{
		return new ResponseEntity<>(vehicleService.saveVehicle(vehicle),HttpStatus.CREATED);
		
	}
	
	@DeleteMapping("{vehicleId}")
	public ResponseEntity<?> deleteVehicle( @PathVariable Long vehicleId)
	{
		vehicleService.deleteProduct(vehicleId);
		return new  ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping //
	public ResponseEntity<?> getAllVehicles()
	{
		return new ResponseEntity<>(vehicleService.findAllVehicles(),HttpStatus.OK);
	}
}
