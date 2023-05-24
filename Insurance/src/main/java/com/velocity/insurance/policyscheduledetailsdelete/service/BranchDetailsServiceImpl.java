package com.velocity.insurance.policyscheduledetailsdelete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.velocity.insurance.policyscheduledetailsdelete.BranchDetails;
import com.velocity.insurance.policyscheduledetailsdelete.repository.BranchDetailsRepository;

@Service
public class BranchDetailsServiceImpl implements BranchDetailsService {
	
	 @Autowired
		private BranchDetailsRepository branchDetailsRepository;
		
	    //inject repository reference
		@Override
		public void  deleteBranchDetailsById(Integer id) {
			 branchDetailsRepository.deleteById(id);
		}
		
}

	
