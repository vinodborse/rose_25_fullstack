package com.skillio.service;

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

}
