package com.velocity.insurance.add.settlementdetails.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.add.settlementdetails.SettlementDetails;
import com.velocity.insurance.add.settlementdetails.repository.SettlementDetailsRepository;
import com.velocity.insurance.add.settlementdetails.service.SettlementDetailsService;

@Service
public class SettlementDetailsServiceImpl implements SettlementDetailsService {
	
	private SettlementDetailsRepository settlementDetailsRepository;

    @Autowired
    public SettlementDetailsServiceImpl(SettlementDetailsRepository settlementDetailsRepository) {
        this.settlementDetailsRepository = settlementDetailsRepository;
    }

	@Override
	public SettlementDetails saveSettlementDetails(SettlementDetails settlementDetails) {
		
		return settlementDetailsRepository.save(settlementDetails);
	}

}
