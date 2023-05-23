package com.velocity.insurance.update.premiumdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.update.premiumdetails.PremiumDetails;

@Repository
public interface PremiumDetailsRepository extends JpaRepository<PremiumDetails, Integer> {

}
