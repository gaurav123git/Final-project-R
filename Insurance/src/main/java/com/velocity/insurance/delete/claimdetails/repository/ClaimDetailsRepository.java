package com.velocity.insurance.delete.claimdetails.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.delete.claimdetails.ClaimDetails;

@Repository
public interface ClaimDetailsRepository extends CrudRepository<ClaimDetails, Serializable>  {

}
