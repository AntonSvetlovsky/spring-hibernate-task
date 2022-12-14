package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {

        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {


//            Employee employee = new Employee("Zaur", "Tregulov", "IT", 500);
//            Detail detail = new Detail("Baku", "123456789", "zaur@gmail.com");
//            Employee employee = new Employee("Max", "Smirnoff", "Sales", 700);
//            Detail detail = new Detail("Minsk", "4587932021", "max@gmail.com");
//            employee.setEmpDetail(detail);

            session.beginTransaction();
            //session.save(employee);

            Employee emp = session.get(Employee.class, 2);
            System.out.println(emp.getEmpDetail());
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
