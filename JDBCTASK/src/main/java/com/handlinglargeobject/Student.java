package com.handlinglargeobject;

import javax.persistence.Lob;


public class Student {

	    private int id;
	    private String name;
	    @Lob
	    private String image;
	    private String Article ;
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
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public String getArticle() {
			return Article;
		}
		public void setArticle(String article) {
			Article = article;
		}
		public Student(int id, String name, String image, String article) {
			super();
			this.id = id;
			this.name = name;
			this.image = image;
			Article = article;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", image=" + image + ", Article=" + Article + "]";
		}
		
	    
   
}
