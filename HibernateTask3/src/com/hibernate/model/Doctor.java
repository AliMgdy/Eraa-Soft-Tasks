package com.hibernate.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	private String userName;
	
	private double salary;
	
    @OneToOne (mappedBy = "doctor")
	private DoctorDetails doctorDetails ;
    
    @OneToMany (mappedBy = "doctor")
    private List<Hospital> hospitals;
    
    @OneToMany (mappedBy = "doctor")
    private List<Patient> patients;
    
}