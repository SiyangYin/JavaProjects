package com.jsf;

import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTest 
{
  private String firstName;
  private String lastName;
  private Date hireDate;
  public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Date getHireDate() {
	return hireDate;
}
public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
}

}
