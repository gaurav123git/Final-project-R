package com.velocity.insurance.get.premiumdetails.service;

import com.velocity.insurance.get.premiumdetails.PremiumDetails;

public interface PremiumDetailsService {
	
	public PremiumDetails savePremiumDetail(PremiumDetails premiumDetail);
	
	public PremiumDetails getPremiumDetailsById(Integer id);

}
