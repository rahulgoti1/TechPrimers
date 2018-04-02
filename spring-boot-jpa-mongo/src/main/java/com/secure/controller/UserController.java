package com.secure.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secure.model.User;
import com.secure.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private UserRepository userRepository;

	public UserController(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@GetMapping("/all")
	public List<User> getAll() {
		return this.userRepository.findAll();
	}
}
