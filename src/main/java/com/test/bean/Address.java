package com.test.bean;

import org.springframework.stereotype.Component;

@Component("addressBean")
public class Address {
	private String State;
	private String city;
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address()
	{
		this.State = "Jammu & kashmir";
		this.city = "Srinagar";
	}
}
