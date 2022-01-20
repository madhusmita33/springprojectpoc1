package com.spring.spring.entity;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;

@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int Id;
	
	@NotBlank(message = "Please enter name")
	//@Size(min = 2, message = "Name should be atleast 2 characters")
	private String Name;
	
	@NotBlank(message = "Please enter your DOJ as dd-mm-yyyy ")
	//@JsonFormat(pattern = "dd-mm-yyyy", shape = Shape.STRING)
	private String Doj;
	
	//@Email(message = "Please enter valid email", regexp="^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}")
	@NotBlank(message = "Please enter Email")
	@Column(unique = true)
	private String email; 
	
	@NotBlank(message = "Please enter Mobile")
	@Size(min=10,  message = "Enter correct mobile number")
	@Size(max=10)
	@Column(unique = true)
	private String MobileNo;
	
	@NotBlank(message = "Please enter Address")
	//@Size(min = 4, message = "address should be atleast 4 characters")
	private String Address;

//	public User(int id,
//			@NotBlank(message = "Please enter name") @Size(min = 2, message = "Name should be atleast 2 characters") String name,
//			@NotBlank(message = "Please enter your DOJ as dd-mm-yyyy ") String doj,
//			@Email(message = "Please enter valid email", regexp = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,5}") @NotBlank(message = "Please enter Email") String email,
//			@NotBlank(message = "Please enter Mobile") @Size(min = 10, message = "Enter correct mobile number") @Size(max = 10) String mobileNo,
//			@NotBlank(message = "Please enter Address") @Size(min = 4, message = "address should be atleast 4 characters") String address) {
//		super();
//		Id = id;
//		Name = name;
//		Doj = doj;
//		this.email = email;
//		MobileNo = mobileNo;
//		Address = address;
//	}
//
//	public User() {
//		super();
//	}

	
	
	
}
