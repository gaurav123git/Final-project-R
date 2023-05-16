package com.velocity.insurance.add.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.add.DriverDetails;
import com.velocity.insurance.add.repository.DriverDetailsRepository;
import com.velocity.insurance.add.service.DriverDetailsService;

@Service
public class DriverDetailsServiceImpl implements DriverDetailsService {

	// inject the repository reference
	@Autowired
	private DriverDetailsRepository driverDetailsRepository;

	@Override
	public DriverDetails saveDriverDetails(DriverDetails driverDetails) {
		DriverDetails driverDetails1 =driverDetailsRepository.save(driverDetails);
		return driverDetails1;
	}

}
