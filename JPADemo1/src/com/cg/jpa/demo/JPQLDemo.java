package com.cg.jpa.demo;
import javax.persistence.*;
import com.cg.jpa.entity.*;
public class JPQLDemo {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em= emf.createEntityManager();
		
		
		Account ac1=new Account();
		ac1.setAccHolderName("Nikhil");
		ac1.setBalance(45000);
		ac1.setMobileNo("9999999999");
		
		Account ac2=new Account();
		ac2.setAccHolderName("Akhil");
		ac2.setBalance(55000);
		ac2.setMobileNo("8888888888");
		
		
		Account ac3=new Account();
		ac3.setAccHolderName("Sunny");
		ac3.setBalance(65000);
		ac3.setMobileNo("9491868977");
		
		Account ac4=new Account();
		ac4.setAccHolderName("Manu");
		ac4.setBalance(75000);
		ac4.setMobileNo("8500999609");
		
		em.getTransaction().begin();
		em.persist(ac1);
		em.persist(ac2);
		em.persist(ac3);
		em.persist(ac4);
		em.getTransaction().commit();
		
		System.out.println("Accounts Added....");

	}

}
