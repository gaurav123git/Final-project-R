package com.velocity.insurance.fetch.policy.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.fetch.policy.Policy;
import com.velocity.insurance.fetch.policy.service.PolicyService;

@RestController

public class PolicyController {
	
	@Autowired
    private PolicyService policyService;

    @Autowired
    public PolicyController(PolicyService policyService) {
        this.policyService = policyService;
    }

    @GetMapping("/policy/{id}")
    public ResponseEntity<byte[]> generatePolicyPDF(@PathVariable ("id") Integer id) throws IOException, NotFoundException {
        Policy policy = policyService.getPolicyDetails(id);
        byte[] pdf = policyService.generatePolicyPDF(policy);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_PDF);
        headers.setContentDispositionFormData("attachment", "policy.pdf");

        return new ResponseEntity<>(pdf, headers, HttpStatus.OK);
    }
}

