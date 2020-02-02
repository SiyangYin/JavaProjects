package com.jpa2;

import javax.persistence.*;  
import com.jpa2.*;  
  
public class EmployeeMain {  
      
    public static void main(String[] args) {  
          
      
  
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");  
    EntityManager em=emf.createEntityManager();  
      
    em.getTransaction().begin();  
      
      
ActiveEmployee ae1=new ActiveEmployee(101,"PENG",10000,5);  
ActiveEmployee ae2=new ActiveEmployee(102,"ALICE",12000,7);  
  
RetiredEmployee re1=new RetiredEmployee(103,"VRUSHANK",5000);  
RetiredEmployee re2=new RetiredEmployee(104,"VISHNU",4000);  
  
    em.persist(ae1);  
    em.persist(ae2);  
      
    em.persist(re1);  
    em.persist(re2);  
      
    em.getTransaction().commit();  
      
    em.close();  
    emf.close();  
      
}}  