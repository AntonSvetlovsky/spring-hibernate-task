package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

//            Employee employee = new Employee("Mike", "Sidorov", "HR", 850);
//            Detail detail = new Detail("London", "29827985729", "mike@gmail.com");
//            employee.setEmpDetail(detail);
//            detail.setEmp(employee);
//            Employee employee = new Employee("Nick", "Ivanov", "HR", 850);
//            Detail detail = new Detail("New-York", "1756567", "nick@gmail.com");
//            employee.setEmpDetail(detail);
//            detail.setEmp(employee);

            session.beginTransaction();

            //session.save(detail);

//            Detail detail = session.get(Detail.class, 4);
//            System.out.println(detail.getEmp());

//            Detail detail = session.get(Detail.class, 4);
//            session.delete(detail);

            Detail detail = session.get(Detail.class, 1);
            detail.getEmp().setEmpDetail(null);
            session.delete(detail);


            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
