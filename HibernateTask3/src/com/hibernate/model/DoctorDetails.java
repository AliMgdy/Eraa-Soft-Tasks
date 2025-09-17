package com.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class DoctorDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fullAddress;
	private String firstName;
	private String lastName;
	private int age;
	
	@OneToOne 
	@JoinColumn(name = "doc_id", nullable = false, unique= true)
	private Doctor doctor;
}