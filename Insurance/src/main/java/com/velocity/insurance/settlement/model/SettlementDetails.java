package com.velocity.insurance.settlement.model;


import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "settlement")
public class SettlementDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String settlement_id;
	private Date date;
	private String amount;
	private String claim_id;
	private boolean status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSettlement_id() {
		return settlement_id;
	}

	public void setSettlement_id(String settlement_id) {
		this.settlement_id = settlement_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getClaim_id() {
		return claim_id;
	}

	public void setClaim_id(String claim_id) {
		this.claim_id = claim_id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
