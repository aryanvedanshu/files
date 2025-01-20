package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	public StudentService service;
	@GetMapping("/getstudents")
	public List<Student> getstudents() {
		return service.getAllStudent();
		}
	
	@PostMapping("/insertStudent")
	public Student insertStudent(@RequestBody Student student) {
		return service.insertStudent(student);
	}
//	@PutMapping("/updateStudent")
//	public ResponseEntity<Student> updateStudent(@PathVariable stid, Student updaStudent){
//		return service.updateStudent(updaStudent);
//	}
	
}
