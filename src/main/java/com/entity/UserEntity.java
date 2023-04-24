package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//connect -> users 
@Entity
@Table(name = "users")
public class UserEntity {

	@Id // pk
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer userId;

	String firstName;
	
	@Column(length = 30,nullable = false,unique = true)
	String email;
	
	String password;
	
	//
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	
	
}

//DoT 

//TRAI -> call(); callertune();  recharge(); 

//Airtel implements  TRAI -- 2GB - 1Day -> 1900 MB  -> 
// call(){}

//Jio implements  TRAI  -> 9898989999

//BSNL 
