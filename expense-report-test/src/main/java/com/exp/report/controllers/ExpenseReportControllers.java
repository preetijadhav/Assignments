package com.exp.report.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exp.report.dto.UserInfo;
import com.exp.report.service.UserDetailsService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value="/api")
@Slf4j
public class ExpenseReportControllers {
	
	@Autowired
	private UserDetailsService userService;
	
	@PostMapping(value="/register", produces="application/json")
	public ResponseEntity<Object> register(@RequestBody UserInfo userInfo) {
		log.info("User registration is in progress.");
		String result = userService.registerUser(userInfo);
		return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}	
	
}
