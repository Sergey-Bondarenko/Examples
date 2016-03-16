package com.siroja;

import com.siroja.entity.User;
import com.siroja.persistence.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by Admin on 02.07.2015.
 */
public class EnterPoint {
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName("Sergey");
        user.setLastName("Bondarenko");

        session.save(user);
        session.getTransaction().commit();
    }
}
