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
        e.setId("25");
        e.setName("Vrushank");
        List<PhoneNumber> l1=new ArrayList<PhoneNumber>();
        PhoneNumber ph1=new PhoneNumber();
        ph1.setPid("34");
        ph1.setNetwork("JIO");
        ph1.setPhonenumber("8988776665");
        PhoneNumber ph2=new PhoneNumber();
        ph2.setPid("35");
        ph2.setNetwork("VODAFONE");
        ph2.setPhonenumber("7298877666");
        l1.add(ph1);
        l1.add(ph2);
        e.setPhoneno(l1);
        s.persist(e); // Insert will be done without return type (void)
        t.commit();
        s.close();
        sf.close();
    }
}
