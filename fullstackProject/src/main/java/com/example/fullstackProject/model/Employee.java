package com.example.fullstackProject.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false,updatable=false)
	private long id;
	private String name ; 
	private String email;
	private String jobtitle;
	private String phone;
	private String imageurl;
	@Column(nullable = false,updatable=false)
	private String employeeCode;
	
	public Employee() {
	}
	
	public Employee( String name, String email, String jobtitle, String phone, String imageurl,
			String employeeCode) {
		
		this.name = name;
		this.email = email;
		this.jobtitle = jobtitle;
		this.phone = phone;
		this.imageurl = imageurl;
		this.employeeCode = employeeCode;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobtitle=" + jobtitle + ", phone="
				+ phone + ", imageurl=" + imageurl + ", employeeCode=" + employeeCode + "]";
	}
	
	
	
}
