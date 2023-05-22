package com.velocity.insurance.update.userdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.update.userdetails.UserDetails;
import com.velocity.insurance.update.userdetails.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUserDetails")
	public ResponseEntity<UserDetails>  saveUserDetails(@RequestBody UserDetails userDetails) {
		
		UserDetails uDetails1 = userService.saveUserDetails(userDetails);
		
		return ResponseEntity.ok().body(uDetails1);
		
		
	}
}
