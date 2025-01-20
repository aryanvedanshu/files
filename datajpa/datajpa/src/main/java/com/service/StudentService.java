package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.entity.Student;
import com.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	public StudentRepository repo;
	
	public  List<Student>  getAllStudent() {
		return repo.findAll();
	}

	public Student insertStudent(Student stObj) {
		// TODO Auto-generated method stub
		return repo.save(stObj);
	}
	public ResponseEntity<Student> updateStudent(Integer id, Student updaStd) {
		Student existingStudent = repo.findById(id).orElse(null);
		if (existingStudent != null) {
			existingStudent.setBranch(updaStd.getBranch());
			existingStudent.setBranch(updaStd.getName());
			Student
			
			return existingStudent;
		}
	}

