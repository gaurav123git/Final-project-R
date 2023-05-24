package com.velocity.insurance.userDetail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.userDetail.model.UserDetail;
import com.velocity.insurance.userDetail.services.UserDetailServices;

@RestController
public class UserDetailController {
	@Autowired
	private UserDetailServices userDetailServices;
	
	@GetMapping("/fetch/{id}")
	public ResponseEntity<UserDetail> getUserDetailById(@PathVariable ("id") Integer id) {
		
		UserDetail userDetail1 = userDetailServices.getUserDetailById(id);
		return ResponseEntity.ok().body(userDetail1);
	}

}
