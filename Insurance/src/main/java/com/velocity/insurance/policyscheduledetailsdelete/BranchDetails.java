package com.velocity.insurance.policyscheduledetailsdelete;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BranchDetails")

public class BranchDetails {
	
	//id,policyscheduletable,policyname,planname,username,premiumamount
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String policyscheduletable;
		private String policyname;
		private String planname;
		private String username;
		private String premiumamount;
	
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getPolicyscheduletable() {
			return policyscheduletable;
		}
		public void setPolicyscheduletable(String policyscheduletable) {
			this.policyscheduletable = policyscheduletable;
		}
		public String getPolicyname() {
			return policyname;
		}
		public void setPolicyname(String policyname) {
			this.policyname = policyname;
		}
		public String getPlanname() {
			return planname;
		}
		public void setPlanname(String planname) {
			this.planname = planname;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPremiumamount() {
			return premiumamount;
		}
		public void setPremiumamount(String premiumamount) {
			this.premiumamount = premiumamount;
		}
		
	}	
		
		


