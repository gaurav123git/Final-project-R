package com.velocity.insurance.get.premiumdetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.get.premiumdetails.PremiumDetails;
@Repository
public interface PremiumDetailsRepository extends CrudRepository<PremiumDetails, Serializable> {
	
	public PremiumDetails findById(Integer id);

}
