package com.velocity.insurance.invoice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.invoice.model.Premium;
import com.velocity.insurance.invoice.repository.PremiumDetailsInvoiceRepository;
import com.velocity.insurance.invoice.service.PremiumDetailsServices;

@Service
public class PremiumDetailsServicesImpl implements PremiumDetailsServices{
	
	    @Autowired
	   private PremiumDetailsInvoiceRepository premiumDetailsRepository;

	@Override
	public Premium savePremiumDetails(Premium premiumDetails) {
		
		  Premium premiumDetails2 = premiumDetailsRepository.save(premiumDetails);
		    
		    return premiumDetails2;
		
	}

	@Override
	public Premium getPremiumDetailsById(Integer id) {
		
		Premium premiumDetails = premiumDetailsRepository.findById(id);
		   
		   return premiumDetails;
		
	}
	
	

}
