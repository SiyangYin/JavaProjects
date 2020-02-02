package hibernate.demo.com.hibernate;

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
        Emp e1=new Emp();
        e1.setId(105);
        e1.setName("MING LEI");
        PhoneNumber ph=new PhoneNumber();
        ph.setPid(106);
        ph.setNetwork("LIO");
        ph.setPhonenumber("9088776563");
        e1.setPhoneno(ph);
        ph.setEmp(e1);
        s.persist(e1); 
        t.commit();
        s.close();
    }
}
