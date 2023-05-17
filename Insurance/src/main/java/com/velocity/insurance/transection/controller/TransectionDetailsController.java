package com.velocity.insurance.transection.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.transection.model.TransectionDetails;
import com.velocity.insurance.transection.service.TransectionDetailsService;

@RestController
public class TransectionDetailsController {
	
	@Autowired
	private TransectionDetailsService transectionDetailsService;
	
	     
	     @PostMapping("/saveMutipleTransection")
	   public ResponseEntity<String> saveTransectionDeatils(@RequestBody List<TransectionDetails> transectionDetails){
		   
		   transectionDetailsService.saveTransectionDetails(transectionDetails);
		   
		   return ResponseEntity.ok("Data inserted successfully");
	   }
	   
	    
	     @GetMapping("/getEachDetails/{status}")
        public ResponseEntity<List<TransectionDetails>> getTransectionDetailsByStatus(@PathVariable("status") String status){
	    	 
	    	   List<TransectionDetails> transections = transectionDetailsService.getTransectionDetailsByStatus(status);
        	
	    	   
	    	     return ResponseEntity.ok().body(transections);
        }
	     
	    

}
