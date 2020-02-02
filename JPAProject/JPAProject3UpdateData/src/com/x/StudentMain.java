package com.x;
import com.x.*;
import javax.persistence.*;  
public class StudentMain {  
      
    public static void main(String args[])  
    {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Student_details");  
        EntityManager em=emf.createEntityManager();  
        em.getTransaction().begin();  
        StudentEntity s=em.find(StudentEntity.class,116);
        /*System.out.println("Before Updation");
        System.out.println("Student ID: "+s.getS_id());
        System.out.println("Student Name: "+s.getS_name());
        System.out.println("Student AGE: "+s.getS_age());
        s.setS_name("Akshita");*/
        em.remove(s);
        em.getTransaction().commit();
        // System.out.println("After Updation");
        System.out.println("After Deletion");
        System.out.println("Student ID: "+s.getS_id());
        System.out.println("Student Name: "+s.getS_name());
        System.out.println("Student AGE: "+s.getS_age());
        emf.close();
        em.close();
    }  
} 