package com.velocity.insurance.update.policyscheduledetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.update.policyscheduledetails.PolicyScheduleDetails;
import com.velocity.insurance.update.policyscheduledetails.repository.PolicyScheduleDetailsRepository;
import com.velocity.insurance.update.policyscheduledetails.service.PolicyScheduleDetailsService;

@Service
public class PolicyScheduleDetailsServiceImpl implements PolicyScheduleDetailsService {

	// inject thr repository reference
	@Autowired
	private PolicyScheduleDetailsRepository policyScheduleDetailsRepository;

	@Override
	public PolicyScheduleDetails getPolicyScheduleDetailsById(Integer id) {
		PolicyScheduleDetails policyScheduleDetails = policyScheduleDetailsRepository.findById(id);
		return policyScheduleDetails;
	}

}
