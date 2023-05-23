package com.velocity.insurance.policyscheduledetailsdelete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.policyscheduledetailsdelete.service.BranchDetailsService;

@RestController
public class BranchDetailsController {
	
	//inject the BranchDetailsService here
	@Autowired
	private BranchDetailsService branchDetailsService;
	
	@DeleteMapping("/delete/{id}")
	     public void deleteBranchDetailsById(@PathVariable("id")Integer id) throws
	     Exception{
		branchDetailsService.deleteBranchDetailsById(id);
	}
	

}
