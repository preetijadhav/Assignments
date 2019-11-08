package com.exp.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exp.report.domain.ExpenseEntity;

public interface ExpenseDetailRepository extends JpaRepository<ExpenseEntity, Long> {

}
