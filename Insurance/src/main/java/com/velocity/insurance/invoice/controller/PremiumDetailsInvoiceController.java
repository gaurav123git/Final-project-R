package com.velocity.insurance.invoice.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.velocity.insurance.invoice.model.Bill;
import com.velocity.insurance.invoice.model.Premium;
import com.velocity.insurance.invoice.service.BillDetailsServices;
import com.velocity.insurance.invoice.service.PremiumDetailsServices;

@RestController
public class PremiumDetailsInvoiceController {
	
	@Autowired
	private PremiumDetailsServices premiumDetailsService;

	@Autowired
	private BillDetailsServices billDetailsService;

	@PostMapping("/saveAll")
	public ResponseEntity<Premium> savePremiumDetails(@RequestBody Premium premiumDetails) {

		Premium premiumDetails2 = premiumDetailsService.savePremiumDetails(premiumDetails);

		List<Bill> bills = premiumDetails.getBillDetailsList();

		for (Bill bills1 : bills) {

			bills1.setPremiumdetails_id(premiumDetails.getId());

			bills1.setDueDate(LocalDate.now().plusDays(30));

			bills1.setCreatedDate(LocalDate.now());

			billDetailsService.saveBillDetails(bills1);
		}

		return ResponseEntity.ok().body(premiumDetails2);

	}

	@GetMapping("/fetchaAll/{id}")
	public Premium getPremiumDetails(@PathVariable("id") Integer id) {

		Premium premiumDetails = premiumDetailsService.getPremiumDetailsById(id);

		return premiumDetails;

	}
}
