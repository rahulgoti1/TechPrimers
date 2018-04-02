package com.secure.jpa.springjpahibernateexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.secure.jpa.springjpahibernateexample.model.Users;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	List<Users> findByName(String name);

}
