package com.skillio;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	@Autowired
	Company c;
	
	public void empData() {
		System.out.println("We are in EMPLOYEE DATA");
	}
	
	public void empSalary() {
		System.out.println("Employee salary...!!!");
		c.companyName();
		
	}
}
