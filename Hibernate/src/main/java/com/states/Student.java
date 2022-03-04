package com.states;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Student {

	// automatic generate table in database
	
	@Id    // making primary key
	private int id;
	
	private String name; 
	
	private String city;
	
	private Certificate certi;
	
	// how to take column name one by one
	
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	@Override
	public String toString() {
		return this.id+" : "+this.name+" : "+this.city;
	}
	
	
	
	
	
}
