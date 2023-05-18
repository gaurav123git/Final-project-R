package com.velocity.insurance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.model.PolicySchedule;
import com.velocity.insurance.repository.PolicyScheduleRepository;
import com.velocity.insurance.service.PolicyScheduleService;

@Service
public class PolicyServiceImpl implements PolicyScheduleService {
	
	
	@Autowired
	private PolicyScheduleRepository policyScheduleRepository;

	@Override
	public PolicySchedule savePolicySchedule(PolicySchedule policySchedule) {
		PolicySchedule policySchedule1 = policyScheduleRepository.save(policySchedule);
		return policySchedule1;
	}

}
