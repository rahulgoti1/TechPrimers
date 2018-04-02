package com.secure.jpa.hibernate.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.secure.jpa.hibernate.model.UserContact;
import com.secure.jpa.hibernate.model.UserLog;
import com.secure.jpa.hibernate.model.Users;
import com.secure.jpa.hibernate.repository.UsersContactRepository;

@RestController
@RequestMapping("/rest/uc")
public class UsersContactResource {

	// @Autowired
	UsersContactRepository usersContactRepository;

	public UsersContactResource(UsersContactRepository usersContactRepository) {
		super();
		this.usersContactRepository = usersContactRepository;
	}

	@GetMapping("/all")
	public List<UserContact> getAll() {
		return usersContactRepository.findAll();
	}

	@GetMapping("/dump/{phone}")
	public List<UserContact> dump(@PathVariable String phone) {
		UserContact uc = new UserContact();
		uc.setPhoneNo(phone);

		Users users = new Users();
		users.setName("Rahul").setSalary(85354500).setTeamName("Development");

		List<UserLog> userLogs = new ArrayList<>();
		userLogs.add(new UserLog().setLog("YouTube"));
		userLogs.add(new UserLog().setLog("LinkedIn"));
		userLogs.add(new UserLog().setLog("Gmail"));

		users.setUserLogs(userLogs);
		uc.setUsers(users);
		usersContactRepository.save(uc);
		return usersContactRepository.findAll();
	}

}
