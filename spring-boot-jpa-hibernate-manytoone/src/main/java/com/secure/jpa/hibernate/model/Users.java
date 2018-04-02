package com.secure.jpa.hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {

	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "name")
	private String name;
	private Integer salary;
	private String teamName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private List<UserLog> userLogs;

	public List<UserLog> getUserLogs() {
		return userLogs;
	}

	public Users setUserLogs(List<UserLog> userLogs) {
		this.userLogs = userLogs;
		return this;
	}

	public Users() {
	}

	public Integer getId() {
		return id;
	}

	public Users setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public Users setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getSalary() {
		return salary;
	}

	public Users setSalary(Integer salary) {
		this.salary = salary;
		return this;
	}

	public String getTeamName() {
		return teamName;
	}

	public Users setTeamName(String teamName) {
		this.teamName = teamName;
		return this;
	}
}
