package com.velocity.insurance.premium.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.premium.model.PremiumDetails;

@Repository
public interface PremiumDetailsRepository extends CrudRepository<PremiumDetails, Serializable> {

}
