package com.busel.spring.hibernate_one_to_one;

import com.busel.spring.hibernate_one_to_one.entity.Detail;
import com.busel.spring.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
//            Employee employee = new Employee("Nick", "Ivanov", "HR", 850);
//            Detail detail = new Detail("New York", "45435344", "nick@gmail.com");
//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);

            session.beginTransaction();
           // session.save(detail);
            Detail detail = session.get(Detail.class,1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();
            System.out.println("Done");

        } finally {
            session.close();
            factory.close();
        }
    }
}