package com.scp.java.hibernate_mapping;

public class TestOneToMany {

	public static void main(String[] args) {
		Address ad1 = new Address(1111, "Arvi", "mh");
		Address ad2 = new Address(1222, "Wardha", "mh");
		
		Student st1 = new Student(11,"vyomkesh", ad1);
		Student st2 = new Student(12,"hitesh", ad1);
		
		
		
	}

}
