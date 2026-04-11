import java.util.Vector;

import Problem4.Student;
Person4
public class Employee extends PersonP {

    public Employee(String name){
        super(name);
    }

    public String toString(){
        return "I am "+name+", employee at KBTU";
    }

    public static void main(String[] args) {
        Vector<PersonP> people = new Vector<PersonP>();
        people.add(new Student("David"));
        people.add(new PersonP("Alim"));
        people.add(new Employee("Max"));

        for(PersonP p : people){
            System.out.println(p);
        }
    }
}