package com.in10s.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in10s.request.CreateStudentRequest;
import com.in10s.service.StudentService;
/***
 * @author Abhishek Amar
 */
@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/create")
	public  ResponseEntity<?> createStudent (@RequestBody CreateStudentRequest createStudentRequest) {
		Map<String,Object> data = new HashMap<>();
		data.put("message", "Student saved successfully , from student microservice. ");
		data.put("data", createStudentRequest);
		return new ResponseEntity<Map<String,Object>>(data,HttpStatus.OK);
	}
	 
	
}
