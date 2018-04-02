package com.secure.jpa.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users_log")
@Entity
public class UserLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "log_id")
	private Integer id;

	private String log;

	@Column(name = "user_id")
	private Integer userId;

	public Integer getUserId() {
		return userId;
	}

	public UserLog setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

	public UserLog() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public UserLog setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getLog() {
		return log;
	}

	public UserLog setLog(String log) {
		this.log = log;
		return this;
	}

}
