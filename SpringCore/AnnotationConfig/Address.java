package com;

import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	
	private int hno;
	
	private String colony;
	
	private int pincode;
	
	private String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getColony() {
		return colony;
	}

	public void setColony(String colony) {
		this.colony = colony;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", colony=" + colony + ", pincode=" + pincode + ", city=" + city + "]";
	}

	public Address(int hno, String colony, int pincode, String city) {
		super();
		this.hno = hno;
		this.colony = colony;
		this.pincode = pincode;
		this.city = city;
	}
	
	

}
