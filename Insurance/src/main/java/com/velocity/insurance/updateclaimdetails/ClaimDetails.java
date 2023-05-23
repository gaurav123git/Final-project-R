package com.velocity.insurance.updateclaimdetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClaimDetails")
public class ClaimDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String claimid;
	private String policyid;
	private String claimstatus;
	private String claimamount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClaimid() {
		return claimid;
	}
	public void setClaimid(String claimid) {
		this.claimid = claimid;
	}
	public String getPolicyid() {
		return policyid;
	}
	public void setPolicyid(String policyid) {
		this.policyid = policyid;
	}
	public String getClaimstatus() {
		return claimstatus;
	}
	public void setClaimstatus(String claimstatus) {
		this.claimstatus = claimstatus;
	}
	public String getClaimamount() {
		return claimamount;
	}
	public void setClaimamount(String claimamount) {
		this.claimamount = claimamount;
	}
	public static ClaimDetails getClaimDetailsById(Integer id2) {
		
		return null;
	}
	
	}
	
	
	
	
	
	


