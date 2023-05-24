package com.velocity.insurance.deletedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.deletedata.service.DeleteDetailService;

@RestController
public class DeleteDetailController {
	
	@Autowired
	private DeleteDetailService deleteDetailService;
	
	@DeleteMapping("/delete/{id}")
	public void deleteDataById(@PathVariable ("id")Integer id) {
		
		deleteDetailService.deleteById(id);
	}

}
