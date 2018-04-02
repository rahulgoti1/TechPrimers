package com.secure.jpa.springjpahibernateexample.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_contact", catalog = "bootjpahibernate")
public class UserContact {

	public UserContact() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	private String phoneNo;

	@OneToOne(cascade = CascadeType.ALL)
	// @JoinColumn(name = "id", referencedColumnName = "user_id")
	@JoinColumn(name = "user_id", referencedColumnName = "user_id") // create new column user_id in user_contact table
																	// as foreign key
	private Users users;

	public Users getUsers() {
		return users;
	}

	public UserContact setUsers(Users users) {
		this.users = users;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public UserContact setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public UserContact setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
		return this;
	}

}
