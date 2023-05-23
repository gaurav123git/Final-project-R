package com.velocity.insurance.duration.service;

import java.util.List;

import com.velocity.insurance.duration.model.AllPremium;


public interface AllPremiumService {

	public void saveAllPremium(List<AllPremium> premium);
	
	 public List<AllPremium> getPremiumByDuration(String duration);
}
