package com.velocity.insurance.update.policydetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.update.policydetails.PolicyDetails;
import com.velocity.insurance.update.policydetails.repository.PolicyDetailsRepository;
import com.velocity.insurance.update.policyschedule.service.PolicyDetailsService;

@RestController
public class PolicyDetailsController {

	// inject the service here
	@Autowired
	private PolicyDetailsService policyDetailsService;

	// inject the repository reference
	@Autowired
	private PolicyDetailsRepository policyDetailsRepository;

	// Design API add policyDetails into database
	@PostMapping("/saveData")
	public PolicyDetails savePolicyDetails(@RequestBody PolicyDetails policyDetails) {
		PolicyDetails policyDetails3 = policyDetailsService.savePolicyDetails(policyDetails);
		return policyDetails3;
	}

	// Design API to update policydetails into database
	@PutMapping("/updatePolicyDetails/{id}")
	public ResponseEntity<PolicyDetails> getPolicyDetailsById(@PathVariable("id") Integer id,
			@RequestBody PolicyDetails policyDetails) {

		PolicyDetails policyDetails4 = policyDetailsService.getPolicyDetailsById(id);

		policyDetails4.setPolicyId(policyDetails.getPolicyId());
		policyDetails4.setPolicyNumber(policyDetails.getPolicyNumber());
		policyDetails4.setPolicyEffectiveDate(policyDetails.getPolicyEffectiveDate());
		policyDetails4.setPolicyExpiryDate(policyDetails.getPolicyExpiryDate());
		policyDetails4.setPayment_option(policyDetails.getPayment_option());
		policyDetails4.setTotalAmount(policyDetails.getTotalAmount());
		policyDetails4.setStatus(policyDetails.getStatus());
		policyDetails4.setCreatedDate(policyDetails.getCreatedDate());
		policyDetails4.setAdditionalInformation(policyDetails.getAdditionalInformation());

		PolicyDetails policyDetails5 = policyDetailsRepository.save(policyDetails4);
		return ResponseEntity.ok().body(policyDetails5);
	}

}
