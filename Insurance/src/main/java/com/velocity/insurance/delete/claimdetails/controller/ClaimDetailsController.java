package com.velocity.insurance.delete.claimdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.delete.claimdetails.service.ClaimDetailsSevice;



@RestController
public class ClaimDetailsController {
	
	@Autowired
	private ClaimDetailsSevice claimDetailsService;
	
	@DeleteMapping("/delete/{id}")
	public void deleteClaimDetailsById(@PathVariable ("id") Integer id) {
		
		claimDetailsService.deleteById(id);
		
		
	}

}
