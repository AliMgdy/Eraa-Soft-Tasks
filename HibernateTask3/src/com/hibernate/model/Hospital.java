package com.hibernate.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int numberOfDoctors;
	private int numberOfPatient;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Doctor doctor;
	
	@ManyToMany(mappedBy = "hospitals")
	private List<Patient> patients;
}