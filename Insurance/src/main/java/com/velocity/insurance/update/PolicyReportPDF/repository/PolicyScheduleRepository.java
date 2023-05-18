package com.velocity.insurance.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.model.PolicySchedule;

@Repository
public interface PolicyScheduleRepository extends JpaRepository<PolicySchedule, Id> {

	
	
}
