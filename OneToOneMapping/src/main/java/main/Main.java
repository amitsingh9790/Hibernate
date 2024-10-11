package main;
import beans.Answer;
import beans.Question;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
//        Question q1 = new Question();
//        q1.setQ_id(112);
//        q1.setQuesion("What is C++");
//
//        Answer ans1 = new Answer();
//        ans1.setA_id(223);
//        ans1.setAnswer("C++ is Programming Language");
//        q1.setAnswer(ans1);

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
//
        Session session = cfg.buildSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
//        Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
//        Transaction tx = session.beginTransaction();
//
//        session.save(q1);
//        session.save(ans1);
//
//        tx.commit();

        //Get
        Question ques = session.get(Question.class,112);
        System.out.println("Ques: "+ques.getQuesion());
        System.out.println("Ans: "+ques.getAnswer().getAnswer());


    }
}
