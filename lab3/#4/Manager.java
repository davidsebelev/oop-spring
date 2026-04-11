import java.util.Date;
import java.util.Vector;

public class Manager extends Employ4ee {
    private Vector<Employ4ee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String ins, double bonus) {
        super(name, salary, hireDate, ins);
        this.team = new Vector<>();
        this.bonus = bonus;
    }

    public Manager() {
        super();
        this.team = new Vector<>();
        this.bonus = 0.0;
    }

    public Vector<Employ4ee> getTeam() { return team; }

    public double getBonus() { return bonus; }

    public void setBonus(double bonus) { this.bonus = bonus; }

    public void addEmployeeToTeam(Employ4ee e) { team.add(e);}

    public void removeEmployeeFromTeam(Employ4ee e) { team.remove(e); }

    @Override
    public String toString() { return super.toString() + ", Bonus: " + bonus + ", Team size: " + team.size(); }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Manager)) return false;
        if (!super.equals(obj)) return false;

        Manager other = (Manager) obj;

        if (Double.compare(bonus, other.bonus) != 0) return false;
        return team.equals(other.team);
    }

    @Override
    public int compareTo(Employ4ee other) {
        if (other instanceof Manager) {
            Manager m = (Manager) other;
            int salaryCompare = Double.compare(this.getSalary(), m.getSalary());
            if (salaryCompare != 0) return salaryCompare;
            return Double.compare(this.bonus, m.bonus);
        }
        return Double.compare(this.getSalary(), other.getSalary());
    }

    @Override
    public Manager clone() {
        Manager cloned = (Manager) super.clone();
        cloned.team = new Vector<>();

        for (Employ4ee e : this.team) {
            cloned.team.add(e.clone());
        }

        return cloned;
    }
}