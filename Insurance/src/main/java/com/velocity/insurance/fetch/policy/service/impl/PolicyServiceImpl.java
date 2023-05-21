package com.velocity.insurance.fetch.policy.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Optional;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.velocity.insurance.fetch.policy.Policy;
import com.velocity.insurance.fetch.policy.repository.PolicyRepository;
import com.velocity.insurance.fetch.policy.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	private PolicyRepository policyRepository;

    @Autowired
    public PolicyServiceImpl(PolicyRepository policyRepository) {
        this.policyRepository = policyRepository;
    }

    @Override
    public Policy  getPolicyDetails(Integer id) throws NotFoundException {
    	 return policyRepository.findById(id)
                 .orElseThrow(() -> new NotFoundException());
    }

	@Override
	public byte[] generatePolicyPDF(Policy policy) throws IOException {
		
		   PDDocument document = new PDDocument();
	        PDPage page = new PDPage();
	        document.addPage(page);

	        PDPageContentStream contentStream = new PDPageContentStream(document, page);
	        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
	        contentStream.beginText();
	        contentStream.newLineAtOffset(25, 700);

	        contentStream.showText("Policy Id: " + policy.getPolicyId());
	        contentStream.newLine();
	        contentStream.showText("Policy Number: " + policy.getPolicyNumber());
	        contentStream.newLine();
	        contentStream.showText("Policy EffectiveDate: " + policy.getPolicyEffectiveDate());
	        contentStream.newLine();
	        contentStream.showText("Policy ExpiryDate: " + policy.getPolicyExpiryDate());
	        contentStream.newLine();
	        contentStream.showText("Policy EffectiveDate: " + policy.getPolicyEffectiveDate());
	        contentStream.newLine();
	        contentStream.showText("Policy PaymentOption: " + policy.getPayment_Option());
	        contentStream.newLine();
	        contentStream.showText("Policy TotalAmount: " + policy.getTotalAmount());
	        contentStream.newLine();
	        contentStream.showText("Policy Status: " + policy.getStatus());
	        contentStream.newLine();
	        contentStream.showText("Policy CreatedDate: " + policy.getCreatedDate());
	        contentStream.newLine();

	        contentStream.endText();
	        contentStream.close();

	        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        document.save(outputStream);
	        document.close();

	        return outputStream.toByteArray();
	}

}
