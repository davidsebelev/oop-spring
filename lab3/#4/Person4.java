public class Person4 {
    private String name;

    public Person4(){this.name = "Unknown";}
    public Person4(String name){this.name = name;}

    
    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    @Override
    public String toString() { return "Name: " + name; }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj) return false;

        if(!(obj instanceof Person4)) return false;

        Person4 other = (Person4) obj;

        return this.name.equals(other.name);
    }
    
}
