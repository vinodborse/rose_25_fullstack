package com.skillio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillio.model.Student;
import com.skillio.repository.StudentRepsitory;

@Service
public class StudentService {
	
	@Autowired
	StudentRepsitory sr;

	public Student addStudent(Student student) {
		Student std = sr.save(student);
		return std;
	}

	public Student getStudentByRollno(Long rollno) {
		return sr.findById(rollno).orElse(new Student());
	}

	public List<Student> getAllStudents() {
		return sr.findAll();
	}

	public List<Student> getStudentsByName(String name) {
		return sr.findByName(name);
	}

	public String helloStudent(Long rollno) {
		Optional<Student> std = sr.findById(rollno);
			
		if(std.isPresent()) {
			return "Hello " + std.get().getName();
		} else {
			return "Student not found";
		}
	}

}
