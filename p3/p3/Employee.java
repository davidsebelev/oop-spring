import java.util.Vector;

public class Employee extends Person {

    public Employee(String name){
        super(name);
    }

    public String toString(){
        return "I am "+name+", employee at KBTU";
    }

    public static void main(String[] args) {
        Vector<Person> people = new Vector<Person>();
        people.add(new Student("David"));
        people.add(new Person("Alim"));
        people.add(new Employee("Max"));

        for(Person p : people){
            System.out.println(p);
        }
    }
}