package com.hibernate.demo.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData_TPC {

	public static void main(String[] args) {

	    
		Configuration c = new Configuration();
		c.configure("hibernate-cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session session=sf.openSession();
	
	Transaction t=session.beginTransaction();
	
	Employee e1=new Employee();  
    e1.setName("PENG");  
      
    Regular_Employee_TPC e2=new Regular_Employee_TPC();  
    e2.setName("WANG");  
    e2.setSalary(50000);  
    e2.setBonus(5);  
      
    Contract_Employee_TPC e3=new Contract_Employee_TPC();  
    e3.setName("XIAO");  
    e3.setPay_per_hour(1000);  
    e3.setContract_duration("15 hours");  
      
    session.persist(e1);  
    session.persist(e2);  
    session.persist(e3);  
      
    t.commit();  
    session.close();  
    System.out.println("Successfully Updated to Database");	
}	
}
