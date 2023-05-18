package com.velocity.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.model.PolicySchedule;
import com.velocity.insurance.service.PolicyScheduleService;

@RestController
public class PolicyScheduleController {

	@Autowired
	private PolicyScheduleService policyScheduleService;
	
	@PostMapping("/savePolicySchedule")
	public ResponseEntity<PolicySchedule> savePolicySchedule(@RequestBody PolicySchedule policySchedule) {

		PolicySchedule ps = policyScheduleService.savePolicySchedule(policySchedule);
		
		return ResponseEntity.ok().body(ps);
	}
	
}
