package com.dao;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class Hibernate_Util {
	private	static Session ses;
	
	static {
		try {
			
		ses=new Configuration().configure("com/cfg/hibernate.cfg.xml").buildSessionFactory().openSession();
		System.out.println("session end");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Session getSession() {
		return ses;
	}

}
