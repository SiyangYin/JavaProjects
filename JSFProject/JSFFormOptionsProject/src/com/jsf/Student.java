package com.jsf;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student
{
    private String firstName;
    private String lastName;
    private String country;
    private Map<String, String> countryOptionsMap;
    public Student()
    {
    	countryOptionsMap=new LinkedHashMap<>();
    	countryOptionsMap.put("USA", "us");
    	countryOptionsMap.put("India", "ind");
    	countryOptionsMap.put("China", "yen");
    	countryOptionsMap.put("Brazil", "brz");
    	countryOptionsMap.put("Germany", "grmy");
    	countryOptionsMap.put("Russia", "rus");
    	countryOptionsMap.put("London", "uk");
    	
    }
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Map<String, String> getCountryOptionsMap() {
		return countryOptionsMap;
	}
	public void setCountryOptionsMap(Map<String, String> countryOptionsMap) {
		this.countryOptionsMap = countryOptionsMap;
	}
}
