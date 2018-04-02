package com.secure.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	@Id
	private Integer id;

	public User(String name, Long salary, String gender) {
		super();
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

	public User(Integer id, String name, Long salary, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public User() {
		super();
	}

	private String name;
	private Long salary;
	private String gender;

}
