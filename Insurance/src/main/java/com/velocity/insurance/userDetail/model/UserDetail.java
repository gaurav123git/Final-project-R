package com.velocity.insurance.userDetail.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data")
public class UserDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String first_Name;
private String last_Name;
private String policy_id;
private String policy_no;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirst_Name() {
	return first_Name;
}
public void setFirst_Name(String first_Name) {
	this.first_Name = first_Name;
}
public String getLast_Name() {
	return last_Name;
}
public void setLast_Name(String last_Name) {
	this.last_Name = last_Name;
}
public String getPolicy_id() {
	return policy_id;
}
public void setPolicy_id(String policy_id) {
	this.policy_id = policy_id;
}
public String getPolicy_no() {
	return policy_no;
}
public void setPolicy_no(String policy_no) {
	this.policy_no = policy_no;
}

}
