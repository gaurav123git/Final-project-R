package com.velocity.insurance.deletepremiumdetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="PremiumDetails")
public class PremiumDetails {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private String premiumId;
	private String policyId;
	private String policyHolderName;
	private String installmentPremiumAmount;
	private String policyCommencementDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPremiumId() {
		return premiumId;
	}
	public void setPremiumId(String premiumId) {
		this.premiumId = premiumId;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public String getInstallmentPremiumAmount() {
		return installmentPremiumAmount;
	}
	public void setInstallmentPremiumAmount(String installmentPremiumAmount) {
		this.installmentPremiumAmount = installmentPremiumAmount;
	}
	public String getPolicyCommencementDate() {
		return policyCommencementDate;
	}
	public void setPolicyCommencementDate(String policyCommencementDate) {
		this.policyCommencementDate = policyCommencementDate;
	}
	
	
	
}
