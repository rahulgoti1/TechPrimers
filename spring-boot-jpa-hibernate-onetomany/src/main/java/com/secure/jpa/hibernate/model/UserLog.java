package com.secure.jpa.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "users_log")
@Entity
public class UserLog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "log_id")
	private Integer id;

	private String log;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private Users user;

	public Users getUser() {
		return user;
	}

	public UserLog setUser(Users user) {
		this.user = user;
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
