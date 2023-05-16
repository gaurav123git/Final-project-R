package com.velocity.insurance.update.policyscheduledetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.update.policyscheduledetails.PolicyScheduleDetails;
import com.velocity.insurance.update.policyscheduledetails.repository.PolicyScheduleDetailsRepository;
import com.velocity.insurance.update.policyscheduledetails.service.PolicyScheduleDetailsService;

@RestController
public class PolicyScheduleDetailsController {

	// inject the service
	@Autowired
	private PolicyScheduleDetailsService policyScheduleDetailsService;

	// inject the repository reference
	@Autowired
	private PolicyScheduleDetailsRepository policyScheduleDetailsRepository;

	// Design the API to update policy schedule details into db
	@PutMapping("/updatePolicyScheduleDetails/{id}")
	public ResponseEntity<PolicyScheduleDetails> getPolicyScheduleDetailsById(@PathVariable("id") Integer id,
			@RequestBody PolicyScheduleDetails policyScheduleDetails) {

		PolicyScheduleDetails policyScheduleDetailss = policyScheduleDetailsService.getPolicyScheduleDetailsById(id);

		policyScheduleDetailss.setPolicyName(policyScheduleDetails.getPolicyName());
		policyScheduleDetailss.setPlanName(policyScheduleDetails.getPlanName());
		policyScheduleDetailss.setUserName(policyScheduleDetails.getUserName());
		policyScheduleDetailss.setPremiumAmount(policyScheduleDetails.getPremiumAmount());

		PolicyScheduleDetails policyScheduleDetails1 = policyScheduleDetailsRepository.save(policyScheduleDetailss);

		return ResponseEntity.ok().body(policyScheduleDetails1);
	}

}
