package com.velocity.insurance.getuserdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.getuserdetails.UserDetails;
import com.velocity.insurance.getuserdetails.service.UserDetailsService;

@RestController
public class UserDetailsController {
	
	//inject the UserDetailsService
	@Autowired
	private UserDetailsService userDetailsService;
	
	@GetMapping("/getuserdetails/{id}")
	     public ResponseEntity<UserDetails> getUserDetailsById(@PathVariable("id")Integer id) {
		 UserDetails userDetails = userDetailsService.getUserDetailsById(id);
		 return ResponseEntity.ok().body(userDetails);
	}

}
