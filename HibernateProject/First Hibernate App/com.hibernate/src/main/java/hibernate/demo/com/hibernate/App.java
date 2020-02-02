package hibernate.demo.com.hibernate;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate-cfg.xml");
        System.out.println("Configuration Object Created Successfully");
        SessionFactory sf=cfg.buildSessionFactory();
        System.out.println("Session Factory Object Created");
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Emp e=new Emp();
        e.setId("2");
       // e.setName("Vrushank");
        // s.update(e);
        s.delete(e);
        /*s.persist(e); // Insert will be done without return type (void)
        System.out.println(s.get(Emp.class, "2"));
        Serializable id=s.save(e);
        System.out.println(id);*/
        t.commit();
        s.close();
    }
}
