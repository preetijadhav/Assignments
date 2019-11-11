package com.exp.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exp.report.domain.ExpenseEntity;

@Repository
public interface ExpenseDetailRepository extends JpaRepository<ExpenseEntity, Long> {

}
