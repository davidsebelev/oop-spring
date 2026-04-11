public class Employeee extends PersonP {
    private int salary;

    public Employeee(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary(){return salary;}

    @Override
    public String getOccupation() { return "Employee, salary: " + salary; }

    @Override
    public int compareTo(PersonP other) {
        if (other instanceof Employeee) {
            Employeee e = (Employeee) other;
            return Integer.compare(this.salary, e.salary);
        }
        return super.compareTo(other);
    }
}