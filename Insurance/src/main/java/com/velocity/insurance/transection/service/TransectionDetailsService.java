package com.velocity.insurance.transection.service;

import java.util.List;

import com.velocity.insurance.transection.model.TransectionDetails;

public interface TransectionDetailsService {
	
	public void saveTransectionDetails(List<TransectionDetails> transectionDetails);
	
	public List<TransectionDetails> getTransectionDetailsByStatus(String status); 
	
	


}
