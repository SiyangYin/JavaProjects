package com.z;
import com.z.*;
import javax.persistence.*;  
public class StudentMain {  
      
    public static void main(String args[])  
    {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
          
        StudentEntity s=em.find(StudentEntity.class,111);
        System.out.println("Student ID: "+s.getS_id());
        System.out.println("Student Name: "+s.getS_name());
        System.out.println("Student AGE: "+s.getS_age());
    }  
} 