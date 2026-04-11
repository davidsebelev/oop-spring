public class BirdSub extends Animalz {
    public BirdSub(String name, int age) { super(name, "Bird", age); }

    @Override
    public String getSound() { return "Tweet"; }
}