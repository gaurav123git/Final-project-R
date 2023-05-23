package com.velocity.insurance.getsettlementdetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.velocity.insurance.getsettlementdetails.service.SettlementDetails1Service;

@Entity
@Table(name = "SettlementDetails1")
public class SettlementDetails1  {
	
	    @Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String settlementId;
		private String date;
		private String amount;
		private String claimId;
		private String status;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSettlementId() {
			return settlementId;
		}
		public void setSettlementId(String settlementId) {
			this.settlementId = settlementId;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getClaimId() {
			return claimId;
		}
		public void setClaimId(String claimId) {
			this.claimId = claimId;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		
		

}
