package com.velocity.insurance.addpolicydetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.addpolicydetails.PolicyDetails;
import com.velocity.insurance.addpolicydetails.service.PolicyDetailsService;

@RestController
@RequestMapping("/policyDetails")
public class PolicyDetailsController {
	
@Autowired
      private PolicyDetailsService policyDetailsService;

      @PostMapping("/save")
      public ResponseEntity<PolicyDetails>
   savePolicyDetails(@RequestBody PolicyDetails policyDetails) {
    	  PolicyDetails poliDetails =
   policyDetailsService.savePolicyDetails(policyDetails);
    	  return ResponseEntity.ok().body(policyDetails);
      }

}
