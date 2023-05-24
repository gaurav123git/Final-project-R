package com.velocity.insurance.deletepremiumdetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.deletepremiumdetails.PremiumDetails;

@Repository
public interface PremiumDetailsRepository extends CrudRepository<PremiumDetails,Serializable> {

}
