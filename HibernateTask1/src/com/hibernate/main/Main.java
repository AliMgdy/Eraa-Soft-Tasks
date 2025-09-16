package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.TeacherGroup906;



public class Main {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration()
				.addAnnotatedClass(TeacherGroup906.class)
				.configure("hibernate.cfg.xml");
		        
		SessionFactory sessionFactory =  configuration.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
	}

}
