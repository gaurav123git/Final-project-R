package com.velocity.insurance.delete.userdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.delete.userdetails.service.UserDetailsService;

@RestController
public class UserDetailsController {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@DeleteMapping("/delete/{id}")
	public void deleteUserDetailsById(Integer id) {
		
		userDetailsService.deleteById(id);
		
	}
	
	
}
