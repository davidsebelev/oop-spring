import java.io.Serializable;

public abstract class Animalz implements Comparable<Animalz>, Serializable {
    private String name;
    private String typeAn;
    private int age;

    public String getName(){return name;}
    public String getTypeAnimal(){return typeAn;}
    public int getAge(){return age;}

    public Animalz(String name, String typeAn, int age) {
        this.name = name;
        this.typeAn = typeAn;
        this.age = age;
    }

    public abstract String getSound();

    @Override
    public String toString() {
        return "name is " + getName() + ", type is " + getTypeAnimal() + " and voice is " + getSound() + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animalz)) return false;
        Animalz a = (Animalz) o;
        return age == a.age && name.equals(a.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }

    @Override
    public int compareTo(Animalz other) {
        int byType = this.typeAn.compareTo(other.typeAn);
        if (byType != 0) return byType;

        int byName = this.name.compareTo(other.name);
        if (byName != 0) return byName;

        return Integer.compare(this.age, other.age);
    }
}