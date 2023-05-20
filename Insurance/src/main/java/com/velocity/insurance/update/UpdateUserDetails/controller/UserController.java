package com.velocity.insurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.model.PolicyUser;
import com.velocity.insurance.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUserDetails")
	public PolicyUser savePolicyUser(@RequestBody PolicyUser policyUser) {
		
		PolicyUser pu = userService.savePolicyUser(policyUser);
		
		return pu;
	}
	
	
}
