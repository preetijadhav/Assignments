package com.exp.report.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.exp.report.dto.Constants;
import com.exp.report.dto.UserInfo;
import com.exp.report.repository.UserDetailsRepository;
import com.exp.report.service.UserDetailsService;

@RunWith(MockitoJUnitRunner.class)
public class UserDetailsServiceImplTest {

	@Mock
	private UserDetailsRepository userDetailsRepository;
	
	@InjectMocks
	private UserDetailsService service = new UserDetailsServiceImpl();

	@Test
	public void registerUserTest() {
		UserInfo userInfo = UserInfo.builder().username("Test-1").password("Pass-1").build();
		Mockito.when(userDetailsRepository.save(userInfo.to())).thenReturn(userInfo.to());
		assertEquals(Constants.USER_SAVED, service.registerUser(userInfo));
	}
}
