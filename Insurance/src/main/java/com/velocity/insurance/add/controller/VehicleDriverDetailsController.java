package com.velocity.insurance.add.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.add.DriverDetails;
import com.velocity.insurance.add.Vehicle;
import com.velocity.insurance.add.service.DriverDetailsService;
import com.velocity.insurance.add.service.VehicleService;

@RestController
public class VehicleDriverDetailsController {

	// inject the service
	@Autowired
	private VehicleService vehicleService;

	// inject the service
	@Autowired
	private DriverDetailsService driverDetailsService;

	// Design the API to add user has multiple nominee
	@PostMapping("/vehicleDriverDetails")
	public Vehicle saveVehicleDriverDetails(@RequestBody Vehicle vehicle) {

		Vehicle vehicle1 = vehicleService.saveVehicle(vehicle);
		// now we have to save the DriverDetails
		List<DriverDetails> driverDetailss = vehicle.getDriverDetailsList();
		// we have to save multiple driverDetails so will take for loop
		for (DriverDetails driverDetails : driverDetailss) {

			driverDetails.setVehicleId(vehicle.getId());
			driverDetailsService.saveDriverDetails(driverDetails);
		}
		return vehicle1;

	}

}
