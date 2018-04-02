package com.secure.jpa.springjpahibernateexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure.jpa.springjpahibernateexample.model.UserContact;

public interface UsersContactRepository extends JpaRepository<UserContact, Integer> {
	List<UserContact> findByPhoneNo(String name);

}
