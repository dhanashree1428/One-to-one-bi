package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EntityManagerFactory entityManagerFactory=
Persistence.createEntityManagerFactory("vikas");

EntityManager entityManager=entityManagerFactory.createEntityManager();

EntityTransaction entityTransaction=entityManager.getTransaction();

Person person=new Person();
person.setName("Dhanashree");
person.setEmail("dhanashree@mail.com");
person.setCno(930704563l);


Pan pan =new Pan();
pan.setAddress("Mumbai");

//setting pan with the specified person
pan.setPerson(person);
person.setPan(pan);

entityTransaction.begin();
entityManager.persist(person);
entityManager.persist(pan);
entityTransaction.commit();

	}

}
