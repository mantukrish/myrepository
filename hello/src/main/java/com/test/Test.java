package com.test;

import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;

import com.dao.Hibernate_Util;

public class Test {

	public static void main(String[] args) {
		final String HQL_QUERY = 
				"FROM com.bo.Reg_BO rb WHERE  rb.username=:uname AND rb.password1=:pswd";
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter user name : ");
			String username=scn.nextLine();
			System.out.println("Enter password : ");
			String password=scn.nextLine();
			
			Session ses=Hibernate_Util.getSession();
			
			try {
				Query query=ses.createQuery(HQL_QUERY);
				query.setParameter("uname", username);
				query.setParameter("pswd", password);
			Object obj=	query.getSingleResult();
			System.out.println("fetched object is "+ obj);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		
	}

}
