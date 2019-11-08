package com.exp.report.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.exp.report.ExpenseReportApplication;
import com.exp.report.domain.UserInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

import static com.jayway.restassured.RestAssured.given;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpenseReportApplication.class)
@TestPropertySource(value = { "classpath:application.properties" })
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class ExpenseReportControllersIT {

	@Value("${server.port}")
	int port;

	private static String URI_POST_REGISTER = "http://localhost:8080/api/register";

	@Test
	public void registerTest() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			given().body(
					mapper.writeValueAsString(UserInfo.builder().username("TestUser").password("Pass1234").build()))
					.contentType(ContentType.JSON).when().post(URI_POST_REGISTER).then()
					.statusCode(HttpStatus.CREATED.value());
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

	@Before
	public void setBaseUri() {
		RestAssured.port = port;
		RestAssured.baseURI = "http://localhost"; // replace as appropriate
	}
}
