public class CatSub extends Animalz {
    public CatSub(String name, int age) { super(name, "Cat", age); }

    @Override
    public String getSound() {return "Meow";}
}