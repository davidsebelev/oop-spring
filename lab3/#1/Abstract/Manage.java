public class Manage extends Person12 {
    // how many year have been working as manager
    private int years;
    private int salary;

    public Manage(String name, int age, int years,int salary){
        super(name,age);
        this.years = years;
        this.salary = salary;
    }

    public int getYears(){return years;}
    public int getSalary(){return salary;}

    public double calculateBonus(){return getSalary() * getYears()/10;}
    
}
