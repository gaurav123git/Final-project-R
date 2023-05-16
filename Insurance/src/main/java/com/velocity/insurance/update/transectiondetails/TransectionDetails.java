package com.velocity.insurance.update.transectiondetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class TransectionDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int transectionId;
	private String amount;
	private int policyid;
	private String transectionStatus;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTransectionId() {
		return transectionId;
	}
	public void setTransectionId(int transectionId) {
		this.transectionId = transectionId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public int getPolicyid() {
		return policyid;
	}
	public void setPolicyid(int policyid) {
		this.policyid = policyid;
	}
	public String getTransectionStatus() {
		return transectionStatus;
	}
	public void setTransectionStatus(String transectionStatus) {
		this.transectionStatus = transectionStatus;
	}
	
	
	
	
	

}
