package com.velocity.insurance.fetch.policy.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.velocity.insurance.fetch.policy.Policy;

public interface PolicyService {
	
	
		public Policy getPolicyDetails(Integer id) throws NotFoundException;
	    public byte[] generatePolicyPDF(Policy policy) throws IOException;
	}

