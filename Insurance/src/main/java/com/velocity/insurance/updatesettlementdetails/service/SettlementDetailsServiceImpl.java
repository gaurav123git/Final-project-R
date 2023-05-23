package com.velocity.insurance.updatesettlementdetails.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import com.velocity.insurance.updatesettlementdetails.SettlementDetails;
import com.velocity.insurance.updatesettlementdetails.repository.SettlementDetailsRepository;

@Service
public class SettlementDetailsServiceImpl implements SettlementDetailsService {
	
	    @Autowired
		private SettlementDetailsRepository settlementdetailsRepository;
		
	    //inject repository reference
		@Override
		public SettlementDetails getSettlementDetailsById(Integer id) {
			SettlementDetails settlementDetails = settlementdetailsRepository.findById(id);
			return settlementDetails;
		}

	}


