package com.velocity.insurance.settlement.service.impl;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.velocity.insurance.settlement.model.SettlementDetails;



public interface SettlementDetailsRepository extends CrudRepository<SettlementDetails, Serializable>{

}
