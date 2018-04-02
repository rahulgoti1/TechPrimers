package com.secure.jpa.hibernate.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secure.jpa.hibernate.model.UserLog;
import com.secure.jpa.hibernate.model.Users;
import com.secure.jpa.hibernate.repository.UserLogRepository;

@RestController
@RequestMapping("/rest/ul")
public class UsersLogResource {

	UserLogRepository userLogRepository;

	public UsersLogResource(UserLogRepository userLogRepository) {
		super();
		this.userLogRepository = userLogRepository;
	}

	@GetMapping("/all")
	public List<UserLog> getAll() {
		return this.userLogRepository.findAll();
	}

	@GetMapping("/dump/{name}")
	public List<UserLog> update(@PathVariable String name) {

		Users user = new Users();
		user.setName(name).setSalary(875485).setTeamName("Dev");

		UserLog ul1 = new UserLog(), ul2 = new UserLog();
		ul1.setLog("Dev Is Art");
		ul1.setUser(user);
		ul2.setLog("Testing is low");
		ul2.setUser(user);

		userLogRepository.save(ul1);
		userLogRepository.save(ul2);
		return this.userLogRepository.findAll();
	}

}
