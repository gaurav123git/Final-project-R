package com.velocity.insurance.duration.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.duration.model.AllPremium;
import com.velocity.insurance.duration.repository.AllPremiumRepository;
import com.velocity.insurance.duration.service.AllPremiumService;

@Service
public class AllPremiumServiceImpl implements AllPremiumService{

	  @Autowired
	  private AllPremiumRepository allPremiumRepository;
	
	@Override
	public void saveAllPremium(List<AllPremium> premium) {

		allPremiumRepository.saveAll(premium);
		
	}

	@Override
	public List<AllPremium> getPremiumByDuration(String duration) {
		
	             List<AllPremium> premiums = allPremiumRepository.findByDuration(duration);
	             
	             return premiums;
	             
	}
	
	
	

}
