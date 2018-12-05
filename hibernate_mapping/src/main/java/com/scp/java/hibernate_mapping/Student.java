package com.scp.java.hibernate_mapping;

import javax.persistence.*;
@Entity
@Table(name="student_info")
public class Student {
@Id
private int id;
private String name;
@OneToOne(cascade=CascadeType.ALL)
private Address address;
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
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}


	
}
