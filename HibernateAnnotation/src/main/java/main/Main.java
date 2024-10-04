package main;

import beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Amit");
        std.setStd_id(101);
        std.setEmail("amitsingh9790@gmail.com");
        std.setGender("Male");
        std.setCity("Gorakhpur");
        std.setRollno(2021022004);

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sf = cfg.buildSessionFactory();

        Session session =sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(std);
        tx.commit();
    }
}

