package com.velocity.insurance.fetch.policy;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private int PolicyId;
	private String PolicyNumber;
	private Date PolicyEffectiveDate;
	private Date PolicyExpiryDate;
	private String PaymentOption;
	private Double TotalAmount;
	private Boolean Status;
	private Date CreatedDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPolicyId() {
		return PolicyId;
	}
	public void setPolicyId(int policyId) {
		PolicyId = policyId;
	}
	public String getPolicyNumber() {
		return PolicyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		PolicyNumber = policyNumber;
	}
	public Date getPolicyEffectiveDate() {
		return PolicyEffectiveDate;
	}
	public void setPolicyEffectiveDate(Date policyEffectiveDate) {
		PolicyEffectiveDate = policyEffectiveDate;
	}
	public Date getPolicyExpiryDate() {
		return PolicyExpiryDate;
	}
	public void setPolicyExpiryDate(Date policyExpiryDate) {
		PolicyExpiryDate = policyExpiryDate;
	}
	public String getPayment_Option() {
		return PaymentOption;
	}
	public void setPayment_Option(String paymentOption) {
		PaymentOption = paymentOption;
	}
	public Double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		TotalAmount = totalAmount;
	}
	public Boolean getStatus() {
		return Status;
	}
	public void setStatus(Boolean status) {
		Status = status;
	}
	public Date getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(Date createdDate) {
		CreatedDate = createdDate;
	}
	

}

