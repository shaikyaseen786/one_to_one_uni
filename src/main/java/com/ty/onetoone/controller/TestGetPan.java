package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pancard;
import com.ty.onetoone.dto.Person;

public class TestGetPan {
public static void main(String[] args) {
	

	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
	EntityManager emEntityManager=entityManagerFactory.createEntityManager();
	
	Pancard pancard = emEntityManager.find(Pancard.class,1);
	Person person=pancard.getPerson();
	
	System.out.println("Pancard Id :"+pancard.getId());
	System.out.println("Local Date :"+pancard.getDate());
	System.out.println("Pancard Number :"+pancard.getPanNumber());
	System.out.println("Country :"+pancard.getCountry());
	System.out.println("--------------We can get attributes of person object inside Pancard -----------");
	System.out.println("Person name : "+person.getName());
	System.out.println("Person Gender : "+person.getGender());
	System.out.println("Person PhoneNum : "+person.getPhone());
	
	
	
}
}