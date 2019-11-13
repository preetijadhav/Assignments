package com.exp.report.dto;

import com.exp.report.domain.UserDetailsEntity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Builder
@Data
public class UserInfo {

	private Integer id;
	private String username;
	private String password;

	public UserDetailsEntity to() {
		return UserDetailsEntity.builder().id(id).username(username).password(password).build();
	}

	public static UserInfo from(UserDetailsEntity userDetailsEntity) {
		return UserInfo.builder().id(userDetailsEntity.getId()).username(userDetailsEntity.getUsername())
				.password(userDetailsEntity.getPassword()).build();
	}
}
