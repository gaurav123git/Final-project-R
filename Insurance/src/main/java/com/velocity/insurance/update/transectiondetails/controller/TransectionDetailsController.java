package com.velocity.insurance.update.transectiondetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.update.transectiondetails.TransectionDetails;
import com.velocity.insurance.update.transectiondetails.repository.TransectionDetailsRepository;
import com.velocity.insurance.update.transectiondetails.service.TransectionDetailsService;

@RestController
public class TransectionDetailsController {

	// inject the service
	@Autowired
	private TransectionDetailsService transectionDetailsService;

	// inject the repository reference
	@Autowired
	private TransectionDetailsRepository transectionDetailsRepository;

	// Design API to update the Transection Details for each user after paying the
	// premium
	@PutMapping("/updateTransectionDetails/{id}")
	public ResponseEntity<TransectionDetails> getTransectionDetailsById(@PathVariable("id") Integer id,
			@RequestBody TransectionDetails transectionDetails) {

		TransectionDetails transectionDetailss = transectionDetailsService.getTransectionDetailsById(id);

		transectionDetailss.setTransectionId(transectionDetails.getTransectionId());
		transectionDetailss.setAmount(transectionDetails.getAmount());
		transectionDetailss.setPolicyid(transectionDetails.getPolicyid());
		transectionDetailss.setTransectionStatus(transectionDetails.getTransectionStatus());

		TransectionDetails transectionDetails1 = transectionDetailsRepository.save(transectionDetailss);

		return ResponseEntity.ok().body(transectionDetails1);

	}

}
