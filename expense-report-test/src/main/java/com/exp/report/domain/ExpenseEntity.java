package com.exp.report.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author preeti
 *
 */
@Entity
@Table(name="EXPENSE_DETAILS")
@Getter
@Setter
@ToString
public class ExpenseEntity  implements Serializable {
    
	private static final long serialVersionUID = 4865903039190150233L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@Column(name="TITLE", length=200, nullable=false, unique=false)
	private String title;
	
	@Column(name="DESCRIPTION", length=200, nullable=true, unique=false)
	private String description;
	
	@Column(name="AMOUNT", length=200, nullable=true, unique=false)
	private String amount;
	
	@Enumerated(EnumType.STRING)
	private Category category;
	
	@Column(name="CREATED_AT", length=200, nullable=true, unique=false)
	private Date created_at;
	
	private enum Category{
		Electricity, Phone, Internet, Grocery, Food
	}
	
}
