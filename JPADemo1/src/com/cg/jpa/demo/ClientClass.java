package com.cg.jpa.demo;
import javax.persistence.*;
import com.cg.jpa.entity.Student;
public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em= emf.createEntityManager();
		/*
		em.getTransaction().begin();
		Student s1=new Student();
		s1.setName("Amit");
		s1.setEmailid("amit@gmail.com");
		em.persist(s1);
		em.flush();
		System.out.println("Record Added:"+s1.getRollno());
		em.getTransaction().commit();
		*/
		/*
		Student s2=em.find(Student.class, 2);
		System.out.println(s2.getRollno());
		System.out.println(s2.getName());
		System.out.println(s2.getEmailid());
		*/
		/*
		Student s3=new Student();  //Updating record
		s3.setRollno(1);
		s3.setName("Amit");
		s3.setEmailid("Amit123@gmail.com");
		em.getTransaction().begin();
		em.merge(s3);
		System.out.println("Records Updated...");
		em.getTransaction().commit();
		*/
		
		Student s4=em.find(Student.class, 2); //deleting record
		em.getTransaction().begin();
		em.remove(s4);
		System.out.println("Removed....");
		em.getTransaction().commit();
		
	}

}
