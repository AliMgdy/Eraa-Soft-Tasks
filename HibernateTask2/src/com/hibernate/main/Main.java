package com.hibernate.main;

import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Player;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration configuration = new Configuration()
				.addAnnotatedClass(Player.class)
				.configure("hibernate.cfg.xml");
		        
		SessionFactory sessionFactory =  configuration.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		// This part for save row
		Player player = new Player(2,"ali",25,true);
		session.save(player);
		
		// This part for update
		Player playerRes =session.get(Player.class, 1);
		System.out.println("====>" + playerRes.toString());
		playerRes.setName("test_name");
		session.update (playerRes);
		System.out.println("====>" + playerRes.toString());
		
		// This part for delete
		Player playerResdel = session.get(Player.class, 1);
		session.delete (playerResdel);
		
		
		// This part for get object with id
		Player playerResGet = session.get(Player.class, 2); 
		if (playerResGet != null) {
		    System.out.println("Player found => " 
		                       + playerResGet.getId() + ", " 
		                       + playerResGet.getName() + ", " 
		                       + playerResGet.getAge() + ", " 
		                       + playerResGet.isStatus());
		} else {
		    System.out.println("No Player found with this ID");
		}
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
