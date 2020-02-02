package com.hibernate.demo.hibernate;  
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

  
public class StoreData_TPH_Annotation {  
public static void main(String[] args) {  
    
	Configuration c = new Configuration();
	c.configure("hibernate-cfg.xml");
	SessionFactory sf = c.buildSessionFactory();
	Session session=sf.openSession();
  
    Transaction t=session.beginTransaction();  
      
    Employee_TPH_Annotation e1=new Employee_TPH_Annotation();  
    e1.setName("Vrushank");  
      
    Regular_Employee_TPH_Annotation e2=new Regular_Employee_TPH_Annotation();  
    e2.setName("Vishnu");  
    e2.setSalary(90000);  
    e2.setBonus(6);  
      
    Contract_Employee_TPH_Annotation e3=new Contract_Employee_TPH_Annotation();  
    e3.setName("Kang");  
    e3.setPay_per_hour(2000);  
    e3.setContract_duration("30 hours");  
      
    session.persist(e1);  
    session.persist(e2);  
    session.persist(e3);  
      
    t.commit();  
    session.close();  
    System.out.println("Successfully updated to Database");  
}  
}  