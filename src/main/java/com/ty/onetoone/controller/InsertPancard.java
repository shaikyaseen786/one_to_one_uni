package com.ty.onetoone.controller;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pancard;
import com.ty.onetoone.dto.Person;

public class InsertPancard {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
		EntityManager emEntityManager=entityManagerFactory.createEntityManager();
		EntityTransaction etEntityTransaction=emEntityManager.getTransaction();
		
		Pancard pancard = new Pancard();
		pancard.setDate(LocalDate.now());
		pancard.setPanNumber(129098);
		pancard.setCountry("India");
		
		
		Person person = new Person();
		person.setName("Shaikh");
		person.setPhone(97794489);
		person.setGender("Male");
		
		pancard.setPerson(person);  //Setting person in Pancard
		
		etEntityTransaction.begin();
		emEntityManager.persist(pancard);
		emEntityManager.persist(person);
		etEntityTransaction.commit();
		
		
		

	}

}
