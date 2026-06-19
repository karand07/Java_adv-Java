package com.Day17;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Manager;
import com.pojo.SalesPerson;
import com.util.HibUtil;

public class App {

    public static void main(String[] args) {

        Session session = HibUtil.getSf().openSession();
        Transaction tx = session.beginTransaction();

        try {

            Manager manager = new Manager(1, "Rahul", 80000, "IT");
            SalesPerson salesPerson = new SalesPerson(2, "Amit", 50000, 5000);

            session.save(manager);
            session.save(salesPerson);

            tx.commit();

            System.out.println("Records inserted successfully.");

        } catch (Exception e) {

            tx.rollback();
            e.printStackTrace();

        } finally {

            session.close();
            HibUtil.closeFactory();

        }
    }
}