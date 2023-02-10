package com.hbase.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@SequenceGenerator(name="auto_increment",sequenceName="auto_increment_seq",initialValue = 1,allocationSize = 1)        
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="auto_increment")
	private long id ; 
	@Column(name = "firstname",length = 20)
	private String firstname; 
	@Column(name = "lastname",length = 20)
	private String lastname ; 
	@Column(name = "email",length = 50)
	private String email ;
	@Column(name = "password",length = 200)
	private String password;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String firstname, String lastname, String email, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}
	
	
	
	
	

}
