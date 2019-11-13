package com.exp.report.service;

import com.exp.report.dto.UserInfo;
import com.exp.report.service.impl.UserDetailsServiceException;

public interface UserDetailsService {
	public UserInfo registerUser(UserInfo userInfo) throws UserDetailsServiceException;
}
