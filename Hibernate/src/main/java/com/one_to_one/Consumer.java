package com.one_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="consumer_data")
public class Consumer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cousumerId;
	private String cousumerName;
	
	@OneToOne
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicle;

	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consumer(int cousumerId, String cousumerName, Vehicle vehicle) {
		super();
		this.cousumerId = cousumerId;
		this.cousumerName = cousumerName;
		this.vehicle = vehicle;
	}

	public int getCousumerId() {
		return cousumerId;
	}

	public void setCousumerId(int cousumerId) {
		this.cousumerId = cousumerId;
	}

	public String getCousumerName() {
		return cousumerName;
	}

	public void setCousumerName(String cousumerName) {
		this.cousumerName = cousumerName;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	

}
