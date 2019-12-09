package com.exp.report.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp.report.domain.UserDetailsEntity;
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
	public UserInfo registerUser(UserInfo userInfo) throws UserDetailsServiceException {
		log.info("Saving the user details");
		UserDetailsEntity result = null;
		try {
			result = userDetailsRepository.save(userInfo.to());
		} catch (Exception e) {
			log.error("Error occured while saving user details. Error message - " + e.getMessage());
			throw new UserDetailsServiceException(e.getMessage());
		}
		log.info("User details are saved successfully");
		return (result!=null?UserInfo.from(result):null);
	}

}
