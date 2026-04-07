package com.skillio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.model.Student;
import com.skillio.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		Student std =  ss.addStudent(student);
		return std;
	}

}
