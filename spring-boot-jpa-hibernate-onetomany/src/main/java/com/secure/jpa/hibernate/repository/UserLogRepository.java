package com.secure.jpa.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure.jpa.hibernate.model.UserLog;

public interface UserLogRepository extends JpaRepository<UserLog, Integer> {

}
