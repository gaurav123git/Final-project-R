package com.velocity.insurance.getmultiplenominee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.getmultiplenomineedetails.Policy;

@Repository
public interface PolicyRepository extends JpaRepository<Policy,Integer> {
 

}
