package com.y;
import com.y.*;
import javax.persistence.*;  
public class StudentMain {  
      
    public static void main(String args[])  
    {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
        StudentEntity s1=new StudentEntity();  
        s1.setS_id(114);  
        s1.setS_name("KANG CHEN");  
        s1.setS_age(23);  
          
        StudentEntity s2=new StudentEntity();  
        s2.setS_id(115);  
        s2.setS_name("ALICE");  
        s2.setS_age(21);  
          
        StudentEntity s3=new StudentEntity();  
        s3.setS_id(116);  
        s3.setS_name("GINGER S");  
        s3.setS_age(27);  
          
        em.persist(s1);  
        em.persist(s2);  
        em.persist(s3);       
  
em.getTransaction().commit();  
          
        emf.close();  
        em.close();  
          
    }  
} 