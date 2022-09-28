package hibernate_eager_lazy;


import hibernate_eager_lazy.entity.Department;
import hibernate_eager_lazy.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

//            Department dep = new Department("Sales" , 1500, 800);
//            Employee emp1 = new Employee("Zaur", "Tregulov", 800);
//            Employee emp2 = new Employee("Helena", "Smirnov", 1500);
//            Employee emp3 = new Employee("Anton", "Sidorov", 1200);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session.beginTransaction();
//
//            System.out.println("Get department.");
//            Department dep = session.get(Department.class, 4);
//            System.out.println("Show department.");
//            System.out.println(dep);
//            System.out.println("Show employees of the department.");
//            System.out.println(dep.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//            session.beginTransaction();
//
//            System.out.println("Get department.");
//            Department dep = session.get(Department.class, 4);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Show department.");
//            System.out.println(dep);
//            System.out.println("Show employees of the department.");
//            System.out.println(dep.getEmps());
//
//            System.out.println("Done!");

            session.beginTransaction();

            System.out.println("Get department.");
            Department dep = session.get(Department.class, 4);

            dep.getEmps().get(0);

            session.getTransaction().commit();

            System.out.println("Show department.");
            System.out.println(dep);
            System.out.println("Show employees of the department.");
            System.out.println(dep.getEmps());

            System.out.println("Done!");

        }
    }
}
