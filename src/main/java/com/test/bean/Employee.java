package com.test.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String Name;
	private Address address;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Autowired
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee(@Value("${Employee.Name}") String Name,Address address)
	//public Employee(@Value("#{addressBean.getState()}") String Name,Address address)
	{
		this.address = address;
		//this.Name = "Imtiyaz Hussain";
		this.Name = Name;
	}
	
	public void testMethod()
	{
		
	}
}
