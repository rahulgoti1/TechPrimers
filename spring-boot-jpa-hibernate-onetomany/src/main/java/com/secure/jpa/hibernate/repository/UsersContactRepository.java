package com.secure.jpa.hibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure.jpa.hibernate.model.UserContact;

public interface UsersContactRepository extends JpaRepository<UserContact, Integer> {
	List<UserContact> findByPhoneNo(String name);

}
