package com.velocity.insurance.add.settlementdetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.add.settlementdetails.SettlementDetails;
@Repository
public interface SettlementDetailsRepository extends JpaRepository<SettlementDetails, Integer> {

}
