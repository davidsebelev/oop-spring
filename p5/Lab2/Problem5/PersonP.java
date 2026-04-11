import java.io.Serializable;
import java.util.Objects;


public abstract class PersonP implements Comparable<PersonP>, Serializable, PetOwner, PetTransfer {
    private String name;
    private int age;
    private Animalz pet;

    public PersonP(String name, int age) {
        this.name = name;
        this.age  = age;
        this.pet  = null;
    }

    public String getName(){return name;}
    public int getAge(){return age;}
    
    @Override
    public Animalz getPet(){return pet;}

    @Override
    public void assignPet(Animalz pet) {this.pet = pet;}
    @Override
    public void removePet(){this.pet = null; }
    @Override
    public boolean hasPet(){return pet != null; }

    public abstract String getOccupation();

    public void leavePetWith(PersonP caretaker) {
        if (!hasPet())
            throw new IllegalStateException(name + " has no pet to leave.");
        if (caretaker.hasPet())
            throw new IllegalStateException(caretaker.getName() + " already has a pet.");
        caretaker.assignPet(this.pet);
        this.removePet();
    }

    public void retrievePetFrom(PersonP caretaker) {
        if (!caretaker.hasPet())
            throw new IllegalStateException(caretaker.getName() + " has no pet to return.");
        if (hasPet())
            throw new IllegalStateException(name + " already has a pet.");
        this.assignPet(caretaker.getPet());
        caretaker.removePet();
    }

    @Override
    public String toString() {
        return name + " (" + getOccupation() + "), age " + age +
               (hasPet() ? ", pet: " + pet : ", no pet");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PersonP)) return false;
        PersonP person = (PersonP) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(PersonP other) {
        int byName = this.name.compareTo(other.name);
        if (byName != 0) return byName;

        return Integer.compare(this.age, other.age);
    }
}