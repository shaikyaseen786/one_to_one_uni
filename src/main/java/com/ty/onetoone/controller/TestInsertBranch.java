package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class TestInsertBranch {  //Insert Operation

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
		EntityManager emEntityManager=entityManagerFactory.createEntityManager();
		EntityTransaction etEntityTransaction=emEntityManager.getTransaction();
		
		Branch branch = new Branch();
		branch.setName("Qspider");
		branch.setPhone_num(78906589);
	
		
		Address address = new Address();
		address.setArea("Basavangudi");
		address.setPin(560021);
		address.setState("Karnataka");
		
		branch.setAddress(address);  //Here we are building relationship b/w Branch & Address
		
		etEntityTransaction.begin();
		emEntityManager.persist(address); //In this line , Saving Address object into Db
		emEntityManager.persist(branch);
		etEntityTransaction.commit();
	}
}
