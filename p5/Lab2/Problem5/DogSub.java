public class DogSub extends Animalz {
    public DogSub(String name, int age) { super(name, "Dog", age); }

    @Override
    public String getSound() {return "Woof";}
}