package com.velocity.insurance.delete.claimdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.claimdetails.model.ClaimDetails;

import com.velocity.insurance.delete.claimdetails.repository.ClaimDetailsRepository;
import com.velocity.insurance.delete.claimdetails.service.ClaimDetailsSevice;

@Service
public class ClaimDetailsServiceImpl implements ClaimDetailsSevice {
	
	@Autowired
	private ClaimDetailsRepository claimDetailsRepository;

	@Override
	public void deleteById(Integer id) {
		
		claimDetailsRepository.deleteById(id);
		
	}

	

	

}
