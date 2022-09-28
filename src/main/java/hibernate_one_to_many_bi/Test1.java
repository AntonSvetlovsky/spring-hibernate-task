package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

//            Department dep = new Department("IT" , 1200, 300);
//            Employee emp1 = new Employee("Zaur", "Tregulov", 800);
//            Employee emp2 = new Employee("Helena", "Smirnov", 1000);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session.beginTransaction();
//
//            Department dep = session.get(Department.class, 8);
//            System.out.println(dep);
//            System.out.println(dep.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 3);
//            System.out.println(emp);
//            System.out.println(emp.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//**********************************************************
//            session.beginTransaction();
//            Employee emp = session.get(Employee.class, 3);
//            session.delete(emp);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
// *******************************************************


//            Department dep = new Department("IT" , 1200, 300);
//            Employee emp1 = new Employee("Zaur", "Tregulov", 800);
//            Employee emp2 = new Employee("Helena", "Smirnov", 1000);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session.beginTransaction();

            Employee emp = session.get(Employee.class, 5);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
