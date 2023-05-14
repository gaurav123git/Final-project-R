package com.velocity.insurance.add;

import java.util.List;
// Author-Gaurav
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {

	// one vehicle has multiple Driver
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String model;
	private String color;
	private String mileage;
	private String vehicleRegistrationState;

	@OneToMany(mappedBy = "vehicleId")
	private List<DriverDetails> driverDetailsList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getVehicleRegistrationState() {
		return vehicleRegistrationState;
	}

	public void setVehicleRegistrationState(String vehicleRegistrationState) {
		this.vehicleRegistrationState = vehicleRegistrationState;
	}

	public List<DriverDetails> getDriverDetailsList() {
		return driverDetailsList;
	}

	public void setDriverDetailsList(List<DriverDetails> driverDetailsList) {
		this.driverDetailsList = driverDetailsList;
	}

}
