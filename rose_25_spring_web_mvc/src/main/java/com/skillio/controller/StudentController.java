package com.skillio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillio.model.Student;

@RestController //@Controller
public class StudentController {

	@GetMapping("/std-name")
	public String getStudentName() {
		return("Student Name is:- Don");
	}
	
	@DeleteMapping("/std")
	public String deleteStudent() {

		String data  = "Student delete..!!!";
		
		return data;
	}
	
	@GetMapping("/std")
	public Student getStudentDetails() {
		Student s = new Student(1, "Don", "Dhule");
		return s;
	}
	
	@GetMapping("/stds")
	public List<Student> getAllStudentDetails() {
		Student s1 = new Student(1, "Don", "Dhule");
		Student s2 = new Student(2, "Salmon", "Mumbai");
		Student s3 = new Student(3, "Aliya", "Delhi");
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		return students;
	}
}
