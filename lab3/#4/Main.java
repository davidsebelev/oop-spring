import java.util.*;

public class Main {
    public static void main(String[] args) {


        Date date1 = new Date(2020 - 1900, 0, 15);
        Date date2 = new Date(2018 - 1900, 5, 1);
        Date date3 = new Date(2022 - 1900, 3, 10);

        Employ4ee emp1 = new Employ4ee("Alice", 50000, date1, "INS-001");
        Employ4ee emp2 = new Employ4ee("Bob", 75000, date2, "INS-002");
        Employ4ee emp3 = new Employ4ee("Alice", 50000, date1, "INS-001");

        Manager mgr1 = new Manager("Diana", 90000, date3, "INS-MGR-1", 15000);
        Manager mgr2 = new Manager("Eve", 90000, date2, "INS-MGR-2", 20000);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(mgr1);
        System.out.println();


        System.out.println(emp1.equals(emp3));
        System.out.println(emp1.equals(emp2));
        System.out.println(mgr1.equals(mgr2));
        System.out.println();


        System.out.println(emp1.compareTo(emp2));
        System.out.println(emp2.compareTo(emp1));
        System.out.println(emp1.compareTo(emp3));
        System.out.println(mgr1.compareTo(mgr2));
        System.out.println();


        List<Employ4ee> employees = new ArrayList<>(Arrays.asList(emp2, emp1, mgr1, emp3, mgr2));

        Collections.sort(employees);
        System.out.println("By salary");
        employees.forEach(e -> System.out.println("  " + e.getName() + " → " + e.getSalary()));

        employees.sort(Employ4ee.BY_NAME);
        System.out.println("By name");
        employees.forEach(e -> System.out.println("  " + e.getName()));

        employees.sort(Employ4ee.BY_HIRE_DATE);
        System.out.println("By hiredate");
        employees.forEach(e -> System.out.println("  " + e.getName() + " → " + e.getHireDate()));
        System.out.println();


        Employ4ee emp1Clone = emp1.clone();
        System.out.println(emp1Clone.equals(emp1));
        System.out.println((emp1Clone == emp1));

        emp1Clone.setHireDate(new Date());
        System.out.println(emp1.getHireDate().equals(date1));

        mgr1.addEmployeeToTeam(emp1);
        mgr1.addEmployeeToTeam(emp2);
        Manager mgr1Clone = mgr1.clone();

        System.out.println(mgr1Clone.equals(mgr1));
        System.out.println((mgr1Clone == mgr1));
        System.out.println((mgr1Clone.getTeam() != mgr1.getTeam()));
        System.out.println();



        System.out.println("Team " + mgr1.getName() + ": " + mgr1.getTeam().size() + " people");
        mgr1.removeEmployeeFromTeam(emp1);
        System.out.println(mgr1.getTeam().size());
        System.out.println(mgr1);

    }
}