package com.skillio;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	@Autowired
	private Dept dept;

	@Autowired
	Company cmp;
	
	public void empData() {
		dept.salary();
		
		System.out.println("I am From "+ cmp.companyName());
	}
	
}
