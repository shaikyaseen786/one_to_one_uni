package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class TestGetBranch {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("dev");
		EntityManager emEntityManager=entityManagerFactory.createEntityManager();
		

		//In this Branch has address ,that means inside Branch object ,there is address object present,
		//If u call Hibernate ,then u will get object of address in Branch obj(bcz relationship)
		
		Branch branch = emEntityManager.find(Branch.class,1);
		Address address = branch.getAddress();
		
		System.out.println("Branch name :"+branch.getName());
		System.out.println("Branch phone_num :"+branch.getPhone_num());
		System.out.println("Branch address :");
		System.out.println("Area  :"+address.getArea());
		System.out.println("Pincode  :"+address.getPin());
		System.out.println("State  :"+address.getState());
		

		
	}

}
