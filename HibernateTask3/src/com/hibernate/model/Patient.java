package com.hibernate.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String typeOfDisease;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Doctor doctor;
	
	@ManyToMany 
	@JoinTable (name ="Pat_Hos",
				joinColumns= @JoinColumn(name = "pat_id"),
				inverseJoinColumns = @JoinColumn(name = "hos_id")
			)
	private List<Hospital> hospitals;
}
