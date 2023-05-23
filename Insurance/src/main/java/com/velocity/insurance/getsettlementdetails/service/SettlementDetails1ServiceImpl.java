package com.velocity.insurance.getsettlementdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.getsettlementdetails.SettlementDetails1;
import com.velocity.insurance.getsettlementdetails.repository.SettlementDetails1Repository;

@Service
public class SettlementDetails1ServiceImpl implements SettlementDetails1Service {
	
	 @Autowired
		private SettlementDetails1Repository settlementdetailsRepository;
		
	    //inject repository reference
		@Override
		public SettlementDetails1  getSettlementDetailsById(Integer id) {
			SettlementDetails1 settlementDetails = settlementdetailsRepository.findById(id);
			return settlementDetails;
		}

	}



