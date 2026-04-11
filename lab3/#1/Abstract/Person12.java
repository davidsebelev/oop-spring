abstract public class Person12 {
    private String name;
    private int age;

    public Person12(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){return name;}
    public int getAge(){return age;}

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + salary);
    }

    public abstract double calculateBonus();
}