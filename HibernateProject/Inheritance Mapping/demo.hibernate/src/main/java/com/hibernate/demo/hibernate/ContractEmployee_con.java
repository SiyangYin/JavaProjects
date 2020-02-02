package com.hibernate.demo.hibernate;
public class ContractEmployee_con extends Employee1
	{  
	    private float pay_per_hour;  
	    private String contract_duration;  
	  
	    public float getPay_per_hour() {  
	        return pay_per_hour;  
	    }  
	    public void setPay_per_hour(float payPerHour) {  
	        pay_per_hour = payPerHour;  
	    }  
	    public String getContract_duration() {  
	        return contract_duration;  
	    }  
	    public void setContract_duration(String contractDuration) {  
	        contract_duration = contractDuration;  
	    }  
}  

