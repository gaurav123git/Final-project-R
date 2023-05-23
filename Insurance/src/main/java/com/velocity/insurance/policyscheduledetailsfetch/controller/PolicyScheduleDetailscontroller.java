package com.velocity.insurance.policyscheduledetailsfetch.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.policyscheduledetailsfetch.PolicyScheduleDetails;
import com.velocity.insurance.policyscheduledetailsfetch.service.PolicyScheduleDetailsService;

@RestController
public class PolicyScheduleDetailscontroller {
	
	
	//inject the service
	@Autowired
	private PolicyScheduleDetailsService policyScheduleDetailsService;
	
	 @GetMapping("/getPolicyScheduleDetails/{id}")
	public ResponseEntity<PolicyScheduleDetails> getPolicyScheduleDetailsById(@PathVariable ("id") Integer id) {
		
	
	  PolicyScheduleDetails policyScheduleDetails = policyScheduleDetailsService.getPolicyScheduleDetailsById( id);
	     return ResponseEntity.ok().body(policyScheduleDetails);
     }

}
