package com.exp.report.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exp.report.domain.UserInfo;

@RestController
@RequestMapping(value="/api")
public class ExpenseReportControllers {
	
	@PostMapping(value="/register", produces="application/json")
	public ResponseEntity<Object> register(@RequestBody UserInfo userInfo) {
		System.out.println("Eneterd the register user case flow");
		return ResponseEntity.status(HttpStatus.CREATED).body("User registered successfully");
	}	
	
}
