package com.in10s.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in10s.request.CreateStudentRequest;
import com.in10s.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/create")
	public  ResponseEntity<?> createStudent (@RequestBody CreateStudentRequest createStudentRequest) {
		return new ResponseEntity<String>("Saved",HttpStatus.OK);
	}
	 
	
}
