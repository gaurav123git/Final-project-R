package com.velocity.insurance.getmultiplenominee.service.imlp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.getmultiplenominee.repository.PolicyRepository;
import com.velocity.insurance.getmultiplenominee.service.PolicyService;
import com.velocity.insurance.getmultiplenomineedetails.Policy;

@Service
public class PolicyServiceImpl implements PolicyService{
		
	       @Autowired
	       private PolicyRepository policyRepository;
	       
	       @Override
	       public Policy getPolicy(Policy policy) {
	              Policy policy1 = policyRepository.save(policy);
	    	      return policy1;
	   }
	       
}	

