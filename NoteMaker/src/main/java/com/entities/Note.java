package com.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NoteMaker")
public class Note {
	
	@Id
	private int id;
	@Column(length=1500)
	private String title;
	private String content;
	private Date Date;
	
	
	
	public Note(String title, String content, Date date) {
		super();
		this.id = new Random().nextInt(100000);
		this.title = title;
		this.content = content;
		Date = date;
	}
	
	



	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getTitle() {
		return title;
	}





	public void setTitle(String title) {
		this.title = title;
	}





	public String getContent() {
		return content;
	}





	public void setContent(String content) {
		this.content = content;
	}





	public Date getDate() {
		return Date;
	}





	public void setDate(Date date) {
		Date = date;
	}





	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
