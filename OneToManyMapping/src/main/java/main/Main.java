package main;

import beans.Answer;
import beans.Question;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Question q1 = new Question();
        q1.setQ_id(111);
        q1.setQuestion("What is Java?");

        Answer a1 = new Answer();
        a1.setA_id(1000);
        a1.setAnswer("Java is Programming Language");
        a1.setQuestion(q1);

        Answer a2 = new Answer();
        a2.setA_id(2000);
        a2.setAnswer("Java uses in Backend");
        a2.setQuestion(q1);

        Answer a3 = new Answer();
        a3.setA_id(3000);
        a3.setAnswer("Java uses Opps Concepts");
        a3.setQuestion(q1);

        List<Answer> AL = new ArrayList<>();
        AL.add(a1);
        AL.add(a2);
        AL.add(a3);

        q1.setAnswerList(AL);

        Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(q1);
        session.save(a1);
        session.save(a2);
        session.save(a3);

        tx.commit();
    }
}
