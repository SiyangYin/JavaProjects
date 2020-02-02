package com.hibernate.demo.hibernate;

import javax.persistence.*;

@Entity  
@DiscriminatorValue("regularemployee") 
public class Regular_Employee_TPH_Annotation extends Employee_TPH_Annotation{  
private float salary;  
private int bonus;
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}  
  


}  
