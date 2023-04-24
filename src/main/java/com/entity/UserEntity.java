package com.entity;

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
}

//DoT 

//TRAI -> call(); callertune();  recharge(); 

//Airtel implements  TRAI -- 2GB - 1Day -> 1900 MB  -> 
// call(){}

//Jio implements  TRAI  -> 9898989999

//BSNL 
