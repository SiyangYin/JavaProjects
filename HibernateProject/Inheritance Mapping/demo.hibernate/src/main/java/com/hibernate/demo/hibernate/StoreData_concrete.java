package com.hibernate.demo.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData_concrete {

	public static void main(String[] args) {

	    Configuration c = new Configuration();
		c.configure("hibernate-cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session session=sf.openSession();
	
	Transaction t=session.beginTransaction();
	
	Employee1 e1=new Employee1();
	e1.setName("SIYANG YIN");  
      
    RegularEmployee_con e2=new RegularEmployee_con();  
    e2.setName("SONG LI");  
    e2.setSalary(60000);  
    e2.setBonus(6);  
      
    ContractEmployee_con e3=new ContractEmployee_con();  
    e3.setName("SHUAI WANG");  
    e3.setPay_per_hour(3000);  
    e3.setContract_duration("25 hours");  
      
    session.persist(e1);  
    session.persist(e2);  
    session.persist(e3);  
      
    t.commit();  
    session.close();  
    System.out.println("Successfully Updated to Database");	
}	
}
