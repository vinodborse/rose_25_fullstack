package com.skillio.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	/*@GetMapping("/std-rollno/{rollno}") // http://localhost:8080/rose_25_spring_web_mvc/std-rollno/4/Vinod
	public Student getStudentByRollNo(@PathVariable("rollno") int rollno) {*/
	
	@GetMapping("/std-rollno") 	// http://localhost:8080/rose_25_spring_web_mvc/std-rollno?rn=3
	public Student getStudentByRollNo(@RequestParam("rn") int rollno) {
		
		Student s1 = new Student(1, "Don", "Dhule");
		Student s2 = new Student(2, "Salmon", "Mumbai");
		Student s3 = new Student(3, "Aliya", "Delhi");
		List<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);

		Student std = new Student(); 
		
		for(Student s : students) {
			if(rollno == s.getRollno()) {
				std = s;
				break;
			}
		}
			
		return std;

		
	}
	
	@PostMapping("/add-student")
	public String addStudent(@RequestBody Student s) {		
		return "Student name is:- " + s.getName();
	}
	
	
	
	
}
