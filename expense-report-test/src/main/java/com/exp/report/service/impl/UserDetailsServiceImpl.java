package com.exp.report.service.impl;

import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.report.dto.Constants;
import com.exp.report.dto.UserInfo;
import com.exp.report.repository.UserDetailsRepository;
import com.exp.report.service.UserDetailsService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	public String registerUser(UserInfo userInfo) {
		log.info("Saving the user details");
		try {
			userDetailsRepository.save(userInfo.to());
		} catch (Exception e) {
			log.error("Error occured while saving user details");
			return "Error occurred while saving user details - " + e.getMessage();
		}
		log.info("User details are saved successfully");
		return Constants.USER_SAVED;
	}

}
