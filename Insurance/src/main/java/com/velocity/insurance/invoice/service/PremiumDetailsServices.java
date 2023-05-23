package com.velocity.insurance.invoice.service;

import com.velocity.insurance.invoice.model.Premium;

public interface PremiumDetailsServices {
	

	  public Premium savePremiumDetails(Premium premiumDetails);
	  
	  public Premium getPremiumDetailsById(Integer id) ;
	  
	  

}
