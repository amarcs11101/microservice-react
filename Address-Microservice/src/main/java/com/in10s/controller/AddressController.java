package com.in10s.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in10s.request.CreateAddressRequest; 
/***
 * @author Abhishek Amar
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/address")
public class AddressController {
 

	@PostMapping("/create")
	public ResponseEntity<?> createAddress (@RequestBody CreateAddressRequest createAddressRequest) {
		Map<String,Object> data = new HashMap<>();
		data.put("message", "Address saved successfully , from address microservice. ");
		data.put("data", createAddressRequest);
		return new ResponseEntity<Map<String,Object>>(data,HttpStatus.OK);
	}
	 
	
}
