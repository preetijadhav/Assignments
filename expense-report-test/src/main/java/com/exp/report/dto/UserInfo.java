package com.exp.report.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
@Getter
@Setter
public class UserInfo {
	private String username;
	private String password;
}	
