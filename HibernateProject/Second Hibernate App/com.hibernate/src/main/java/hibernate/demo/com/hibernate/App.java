package hibernate.demo.com.hibernate;

import java.util.ArrayList;
import java.util.List;

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
        e.setId("16");
        e.setName("Kang");
        List<PhoneNumber> l=new ArrayList<PhoneNumber>();
        PhoneNumber ph=new PhoneNumber();
        ph.setPid("19");
        ph.setNetwork("Airtel");
        ph.setPhonenumber("9988776655");
        l.add(ph);
        e.setPhoneno(l);
        s.persist(e); // Insert will be done without return type (void)
        t.commit();
        s.close();
        sf.close();
    }
}
