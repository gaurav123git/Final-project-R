package com.velocity.insurance.getmultiplenomineedetails;

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
	private String policyId;
	private String policyName;
	private String status;
	private Integer userid; 
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPolicyId() {
		return policyId;
	}
	
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	
	public String getPolicyName() {
		return policyName;
	}
	
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Integer getUserid() {
		return userid;
	}
	
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	
	

}
