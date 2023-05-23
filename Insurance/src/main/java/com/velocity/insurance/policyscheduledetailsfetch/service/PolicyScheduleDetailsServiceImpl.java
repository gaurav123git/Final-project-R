package com.velocity.insurance.policyscheduledetailsfetch.service;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import com.velocity.insurance.policyscheduledetailsfetch.PolicyScheduleDetails;
import com.velocity.insurance.policyscheduledetailsfetch.repository.PolicyScheduleDetailsRepository;

@Service
public class PolicyScheduleDetailsServiceImpl implements PolicyScheduleDetailsService {
	
    @Autowired
	private PolicyScheduleDetailsRepository policyscheduledetailsRepository;
	
    //inject repository reference
	@Override
	public PolicyScheduleDetails getPolicyScheduleDetailsById(Integer id) {
		PolicyScheduleDetails policyScheduleDetails = policyscheduledetailsRepository.findById(id);
		return policyScheduleDetails;
	}

}