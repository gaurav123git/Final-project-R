package com.velocity.insurance.getmultiplenominee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.getmultiplenominee.service.PolicyService;
import com.velocity.insurance.getmultiplenominee.service.UserService;
import com.velocity.insurance.getmultiplenomineedetails.Policy;
import com.velocity.insurance.getmultiplenomineedetails.User;

@RestController
@RequestMapping(value ="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PolicyService policyService;
	
	@GetMapping("/getUserPolicy")
	ResponseEntity<User> getUserPolicy(@RequestBody User user) {
		User user1 = userService.getUser(user);
		List<Policy> policies = user.getPolicyList();
		for (Policy policy : policies) {
			policy.setUserid(user.getId());
			policyService.getPolicy(policy);
		}
		return ResponseEntity.ok().body(user1);
		}
	}
	


