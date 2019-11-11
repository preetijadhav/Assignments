package com.exp.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exp.report.domain.UserDetailsEntity;

public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity, Integer>{

}
