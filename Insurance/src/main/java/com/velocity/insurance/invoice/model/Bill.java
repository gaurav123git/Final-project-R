package com.velocity.insurance.invoice.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billDetails")
public class Bill {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int bill_Id;
	private LocalDate dueDate;
	private Double minimumPayment;
	private LocalDate createdDate;
	private Double balance;
	private boolean status;
	private Integer premiumdetails_id;
  
   
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBill_Id() {
		return bill_Id;
	}

	public void setBill_Id(int bill_Id) {
		this.bill_Id = bill_Id;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getMinimumPayment() {
		return minimumPayment;
	}

	public void setMinimumPayment(Double minimumPayment) {
		this.minimumPayment = minimumPayment;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public Integer getPremiumdetails_id() {
		return premiumdetails_id;
	}
	public void setPremiumdetails_id(Integer premiumdetails_id) {
		this.premiumdetails_id = premiumdetails_id;
	}
}
