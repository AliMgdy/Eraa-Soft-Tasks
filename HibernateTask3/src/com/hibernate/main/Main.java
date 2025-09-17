package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Doctor;
import com.hibernate.model.DoctorDetails;
import com.hibernate.model.Hospital;
import com.hibernate.model.Patient;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration()
				.addAnnotatedClass(Hospital.class)
				.addAnnotatedClass(Doctor.class)
				.addAnnotatedClass(DoctorDetails.class)
				.addAnnotatedClass(Patient.class)
				.configure("hibernate.cfg.xml");
		        
		SessionFactory sessionFactory =  configuration.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		
		session.close();
		sessionFactory.close();
	}

}
