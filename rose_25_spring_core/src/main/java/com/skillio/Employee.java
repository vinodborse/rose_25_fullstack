package com.skillio;

public class Employee {

	private Dept dept;
//	private String name;
	
	
	
	public void empData() {
		
		
		dept.salary();
	}



	public Dept getDept() {
		return dept;
	}



	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Employee() {}

	public Employee(Dept dept) {
		this.dept = dept;
	}
	
	
}
