package com.scp.java.hibernate_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {

	public static void main(String[] args) {
		
		
		Address pune = new Address(1113, "pune", "Maharashtra");
		Address Amravati = new Address(2224, "Amravati", "Maharashtra");
		
		Student s1 = new Student(103,"abc",pune);
		Student s2 = new Student(104,"pqr",Amravati);
		
		Configuration cfg = new Configuration();
		SessionFactory sf= cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		s.save(s1);
		s.save(s2);
		
		//s.flush();
		t.commit();
		
		

	}

}
