package com.hibernate.demo.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "emp1345")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "employee")
public class Employee_TPH_Annotation {
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)  
	      
	@Column(name = "id") 
	private int id;
	private String name;

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
}