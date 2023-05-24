package com.velocity.insurance.deletedata.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.velocity.insurance.deletedata.repository.DeleteDetailRepository;
import com.velocity.insurance.deletedata.service.DeleteDetailService;

public class DeleteDetailServiceImpl implements DeleteDetailService  {

	@Autowired
	private DeleteDetailRepository deleteDetailRepository;
	
	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		deleteDetailRepository.deleteById(id);
	}
	

}
