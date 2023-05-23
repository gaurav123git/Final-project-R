package com.velocity.insurance.settlement.service;

import com.velocity.insurance.settlement.model.SettlementDetails;

public interface SettlementDetailsService {

	    public SettlementDetails saveSettlementDetails(SettlementDetails settlementDetails);
	    
	    public void deleteSettlementDetailsById(Integer id);
	
}
