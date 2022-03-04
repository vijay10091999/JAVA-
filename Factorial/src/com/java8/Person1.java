package com.java8;

class Person1{​​​
int id;
String name;



public Person1(int id, String name) {
	super();
	this.id = id;
	this.name = name;
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
@Override
public String toString() {
	return "Person1 [id=" + id + ", name=" + name + "]";
}


}