package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")
public class TeacherGroup906 {
	
	@Id
	@Column (name = "Teacher_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column (name = "Teacher_name" , length = 50, nullable = false)
    private String name;
	
	@Column (name = "Teacher_age")
    private int age;
	
	@Column (name = "Teacher_address" , unique = true)
    private String address;

    
    public TeacherGroup906() {
    }

    public TeacherGroup906(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // ===== Getters & Setters =====
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // ===== toString =====
    @Override
    public String toString() {
        return "Teacher [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
    }
}
