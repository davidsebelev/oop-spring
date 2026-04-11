public class Chocolate implements Comparable<Chocolate> {
    private String name;
    private double weight;

    public Chocolate(){
        this.name = "Unknown";
        this.weight = 0.0;
    }

    public Chocolate(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){ return name; }
    public double getWeight(){ return weight; }

    public void setName(String name){ this.name = name; }
    public void setWeight(double weight){ this.weight = weight; }

    @Override
    public String toString(){ return "This is chocolate " + getName() + " with " + getWeight() + " weight " + "\n"; }

    @Override
    public int compareTo(Chocolate other){
        return Double.compare(this.weight, other.weight);
    }

}
