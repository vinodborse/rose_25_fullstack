package com.skillio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillio.model.Student;

@Repository
public interface StudentRepsitory extends JpaRepository<Student, Long> {
	
	List<Student> findByName(String name);
	
	List<Student> findByAddress(String address);
	
	//SELECT * FROM student WHERE rollno = 1 AND address = "..."
	
	Optional<Student> findByRollnoAndAddress(Long rollno, String address);
}
