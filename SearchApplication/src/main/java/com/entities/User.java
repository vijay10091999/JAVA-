package com.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id  
	private int id;
	private String name;
	private String email;
	private String gender;
	private int phone;
	private String profile;

	public User(int id,String profile, String name, String email, String gender,int phone) {

		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.profile=profile;

	}

	public User() {

	}

	public User(String name, String email, String gender,int phone) {

		this.name = name;
		this.email = email;
		this.gender = gender;
		this.phone = phone;
	

	}

	// getter and setters

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", phone=" + phone
				+ ", profile=" + profile + "]";
	}

	
}
