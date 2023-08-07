package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.Hibernateutil;
import com.model.Course;
import com.model.Student;

public class Test {
	public static void main(String[] args) {
		SessionFactory sf=Hibernateutil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Course java=new Course();
		       java.setCid(234);
		       java.setCname("JAVA");
		       
		Course python=new Course();
		       python.setCid(3000);
		       python.setCname("PYTHON");
		       
		       
	   Student A=new Student();
	           A.setSid(6764);
	           A.setSname("Ram");
	          
	  Student B=new Student();
	         B.setSid(4345);
	         B.setSname("Shyam");
	         
	
	
	
	A.getC().add(java);
	A.getC().add(python);
	B.getC().add(java);
	B.getC().add(python);
	java.getS().add(A);
	java.getS().add(B);
	python.getS().add(A);
	python.getS().add(B);
	
	session.save(A);
	session.save(B);
	tx.commit();
     
	 
	}
	

}
