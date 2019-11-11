package com.exp.report.dto;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.exp.report.domain.UserDetailsEntity;

public class UserInfoTest {
	
	UserInfo userInfo = null;
	UserDetailsEntity userDetailsEntity = null;

	@Before
	public void before() {
		userInfo = UserInfo.builder().username("TestUser").password("Pass1234").build();
		userDetailsEntity = UserDetailsEntity.builder().username("TestUser").password("Pass1234").build();
	}
	
	@After
	public void after() {
		userInfo = null;
		userDetailsEntity = null;
	}
	
	@Test
	public void toTest() {
		assertEquals(userInfo.to(),userDetailsEntity);
	}
	
	@Test
	public void fromTest() {
		assertEquals(UserInfo.from(userDetailsEntity),userInfo);
	}
}
