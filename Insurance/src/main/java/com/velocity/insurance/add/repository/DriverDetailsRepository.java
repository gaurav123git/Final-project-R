package com.velocity.insurance.add.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.add.DriverDetails;
@Repository
public interface DriverDetailsRepository extends CrudRepository<DriverDetails, Integer> {

}
