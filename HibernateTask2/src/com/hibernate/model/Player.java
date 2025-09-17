package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {

    public Player() {
    	
	}
    
	@Id
    private int id; 

	@Column(nullable = false)
    private String name; 

    private int age; 

    private boolean status; 
        

    public Player(int id, String name, int age, boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.status = status;
	}
    
    // Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", age=" + age + ", status=" + status + "]";
	}
    
}
