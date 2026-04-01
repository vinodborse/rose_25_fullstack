package com.skillio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.model.Employee;

@RestController    //@Controller + @ResponseBody
public class EmployeeController {

	@GetMapping("/emp-name")
	public String sample() {
		return("Vinod");
	}
	
	@GetMapping("/emp")
	public Employee getEmployeeData() {

		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Vinod");
		emp.setAddress("Pune");
		
		return emp;
	}
	
	
	
	
}
