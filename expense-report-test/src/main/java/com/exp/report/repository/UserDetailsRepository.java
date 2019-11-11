package com.exp.report.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exp.report.domain.UserDetailsEntity;

@Repository
@Transactional
public interface UserDetailsRepository extends JpaRepository<UserDetailsEntity, Integer>{

}
