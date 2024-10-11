package main;

import beans.Employee;
import beans.Project;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmp_id(100);
        e1.setEmp_name("Amit Singh");

        Employee e2 = new Employee();
        e2.setEmp_id(200);
        e2.setEmp_name("Md. Sanual");

        Employee e3 = new Employee();
        e3.setEmp_id(300);
        e3.setEmp_name("Prabesh Dubey");

        Project p1 = new Project();
        p1.setPro_id(1000);
        p1.setPro_name("Hospital Management System");

        Project p2 = new Project();
        p2.setPro_id(2000);
        p2.setPro_name("Student Management System");

        Project p3 = new Project();
        p3.setPro_id(3000);
        p3.setPro_name("Bank Management System");

        List<Employee> el = new ArrayList<>();
        el.add(e1);
        el.add(e2);
        el.add(e3);
        p3.setEmployeeList(el);

        List<Project>pl = new ArrayList<>();
        pl.add(p3);
        e1.setProjectList(pl);
        e2.setProjectList(pl);
        e3.setProjectList(pl);

        Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(e1);
        session.save(e2);
        session.save(e3);
        session.save(p1);
        session.save(p2);
        session.save(p3);

        Employee employee = session.get(Employee.class,300);
        for (Project p : employee.getProjectList())
            System.out.println(p.getPro_name());


        tx.commit();
    }
}
