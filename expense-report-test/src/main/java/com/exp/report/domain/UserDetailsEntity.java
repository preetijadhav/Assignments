package com.exp.report.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="USER_DETAILS")
@Getter
@Setter
@ToString
public class UserDetailsEntity  implements Serializable {
    
	private static final long serialVersionUID = 4865903039190150243L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="USERNAME", length=10, nullable=false, unique=false)
	private String username;
	
	@Column(name="PASSWORD", length=10, nullable=false, unique=false)
	private String password;
}
