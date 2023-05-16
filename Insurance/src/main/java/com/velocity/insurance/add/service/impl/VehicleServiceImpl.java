package com.velocity.insurance.add.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.add.Vehicle;
import com.velocity.insurance.add.repository.VehicleRepository;
import com.velocity.insurance.add.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	// inject the repository reference
	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public Vehicle saveVehicle(Vehicle vehicle) {
		Vehicle vehicle1 =vehicleRepository.save(vehicle);
		return vehicle1;
	}

}
