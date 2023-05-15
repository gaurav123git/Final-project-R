package com.velocity.insurance.transection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.transection.model.TransectionDetails;
import com.velocity.insurance.transection.repository.TransectionDetailsRepository;
import com.velocity.insurance.transection.service.TransectionDetailsService;

@Service
public class TransectionDetailsServiceImpl implements TransectionDetailsService{
	
	@Autowired
	private TransectionDetailsRepository transectionDetailsRepository ;

	@Override
	public void saveTransectionDetails(List<TransectionDetails> transectionDetails) {
		
		transectionDetailsRepository.saveAll(transectionDetails);
		
	}

	@Override
	public List<TransectionDetails> getTransectionDetailsByStatus(String status) {

		    List<TransectionDetails> transectionDetails = transectionDetailsRepository.findByStatus(status);
		
		    return transectionDetails;
	}
	
	


	
	
	

}
