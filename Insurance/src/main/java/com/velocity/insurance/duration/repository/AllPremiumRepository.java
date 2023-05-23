package com.velocity.insurance.duration.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.duration.model.AllPremium;

@Repository
public interface AllPremiumRepository extends CrudRepository<AllPremium, Serializable>{

	  @Query(value="select * from premium p where duration=?1", nativeQuery=true)
		
      public List<AllPremium> findByDuration(String duration);
      
	
}
