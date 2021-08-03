package com.ashish.AngularProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="registration", uniqueConstraints = {@UniqueConstraint(columnNames = {"username"})})
public class Registration {

	@Id
	private int userid;
	private String fname;
	private String lname;
	private String email;
	
	@Column(unique = true)
	private String username;
	
	private String password;
	private String mobileno;
	private String gender;
	private String address;
	
	public Registration() {
		// TODO Auto-generated constructor stub
	}

	public Registration(int userid, String fname, String lname, String email, String username, String password,
			String mobileno, String gender, String address) {
		super();
		this.userid = userid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.username = username;
		this.password = password;
		this.mobileno = mobileno;
		this.gender = gender;
		this.address = address;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Registration [userid=" + userid + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", mobileno=" + mobileno + ", gender=" + gender
				+ ", address=" + address + "]";
	}
	
	
	
}
