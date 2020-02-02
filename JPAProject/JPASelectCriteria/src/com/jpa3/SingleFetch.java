package com.jpa3;
import com.jpa3.*;  
import javax.persistence.*;  
import javax.persistence.criteria.*;  
  
import java.util.*;  
public class SingleFetch  {  
      
      
    public static void main( String args[]) {  
             
           
         EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
          CriteriaBuilder cb=em.getCriteriaBuilder();  
          CriteriaQuery<StudentEntity> cq=cb.createQuery(StudentEntity.class);  
            
         Root<StudentEntity> stud=cq.from(StudentEntity.class);  
           
         cq.select(stud.get("s_name"));   
           
          CriteriaQuery<StudentEntity> select = cq.select(stud);  
          TypedQuery<StudentEntity> q = em.createQuery(select);  
          List<StudentEntity> list = q.getResultList();  
  
          System.out.println("s_id");  
               
            
          for(StudentEntity s:list)  
          {  
          System.out.println(s.getS_id());  
      
        }  
            
em.getTransaction().commit();  
          em.close();  
          emf.close();    
     }  
}  
