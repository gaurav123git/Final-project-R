package com.velocity.insurance.update.premiumdetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="premiumdetails")
public class PremiumDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String premium_id;
	private String policy_id;
	private String policy_holder_name;
	private String installment_premium_amount;
	private String policy_commencement_date;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPremium_id() {
		return premium_id;
	}

	public void setPremium_id(String premium_id) {
		this.premium_id = premium_id;
	}

	public String getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}

	public String getPolicy_holder_name() {
		return policy_holder_name;
	}

	public void setPolicy_holder_name(String policy_holder_name) {
		this.policy_holder_name = policy_holder_name;
	}

	public String getInstallment_premium_amount() {
		return installment_premium_amount;
	}

	public void setInstallment_premium_amount(String installment_premium_amount) {
		this.installment_premium_amount = installment_premium_amount;
	}

	public String getPolicy_commencement_date() {
		return policy_commencement_date;
	}

	public void setPolicy_commencement_date(String policy_commencement_date) {
		this.policy_commencement_date = policy_commencement_date;
	}

}
