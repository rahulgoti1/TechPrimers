package com.secure.jpa.hibernate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure.jpa.hibernate.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	List<Users> findByName(String name);

}
