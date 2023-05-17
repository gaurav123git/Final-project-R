package com.velocity.insurance.add.userdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.add.userdetails.UserDetails;
import com.velocity.insurance.add.userdetails.service.UserDetailsService;

@RestController
public class UserDetailsController {

	// inject the service
	@Autowired
	private UserDetailsService userDetailsService;

	// Design the API to add user details into database
	@PostMapping("/saveUserDetails")
	public ResponseEntity<UserDetails> saveUserDetails(@RequestBody UserDetails userDetails) {

		UserDetails userDetails1 = userDetailsService.saveUserDetails(userDetails);
		return ResponseEntity.ok().body(userDetails1);
	}
}
