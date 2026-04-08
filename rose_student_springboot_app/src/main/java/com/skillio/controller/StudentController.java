package com.skillio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/get-student")
	public Student getStudentByRollno(@RequestParam("rollno") Long rollno) {
		return ss.getStudentByRollno(rollno);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return ss.getAllStudents();
	}
	

	@GetMapping("/students-by-name")
	public List<Student> getStudentsByName(@RequestParam("name") String name) {
		return ss.getStudentsByName(name);
	}
	
	@GetMapping("/get-student-name")
	public String helloStudent(@RequestParam("rollno") Long rollno) {
		return ss.helloStudent(rollno);
	}
	
}