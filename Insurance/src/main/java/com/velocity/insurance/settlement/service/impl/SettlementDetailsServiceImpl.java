package com.velocity.insurance.settlement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.repository.SettlementDetailsRepository;
import com.velocity.insurance.settlement.model.SettlementDetails;
import com.velocity.insurance.settlement.service.SettlementDetailsService;

@Service
public class SettlementDetailsServiceImpl implements SettlementDetailsService{
	
	@Autowired
	private SettlementDetailsRepository settlementDetailsRepository;

	@Override
	public SettlementDetails saveSettlementDetails(SettlementDetails settlementDetails) {
		
		        SettlementDetails settlementDetails2 = settlementDetailsRepository.save(settlementDetails);
		        
		        return settlementDetails2;
		        
	}

	@Override
	public void deleteSettlementDetailsById(Integer id) {
		
		settlementDetailsRepository.deleteById(id);
		
	}

}
