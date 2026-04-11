import java.util.Comparator;
import java.util.Date;

public class Employ4ee extends Person4 implements Comparable<Employ4ee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public static final Comparator<Employ4ee> BY_NAME = 
            Comparator.comparing(Employ4ee::getName);

    public static final Comparator<Employ4ee> BY_HIRE_DATE =
            Comparator.comparing(Employ4ee::getHireDate);

    public Employ4ee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = new Date(hireDate.getTime());
        this.insuranceNumber = insuranceNumber;
    }

    public Employ4ee() {
        super();
        this.salary = 0.0;
        this.hireDate = new Date();
        this.insuranceNumber = "Unknown";
    }

    public double getSalary() { return salary; }

    public Date getHireDate() { return new Date(hireDate.getTime()); }

    public String getInsuranceNumber() { return insuranceNumber; }

    public void setSalary(double salary) { this.salary = salary; }

    public void setHireDate(Date hireDate) { this.hireDate = new Date(hireDate.getTime()); }

    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary + ", Hired: " + hireDate + ", Insurance Number: " + insuranceNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employ4ee)) return false;

        Employ4ee other = (Employ4ee) obj;

        if (!getName().equals(other.getName())) return false;
        if (Double.compare(salary, other.salary) != 0) return false;
        if (!hireDate.equals(other.hireDate)) return false;

        if (insuranceNumber == null) return other.insuranceNumber == null;
        return insuranceNumber.equals(other.insuranceNumber);
    }

    @Override
    public int compareTo(Employ4ee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public Employ4ee clone() {
        try {
            Employ4ee cloned = (Employ4ee) super.clone();
            cloned.hireDate = new Date(this.hireDate.getTime());
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Cloning failed");
        }
    }
}