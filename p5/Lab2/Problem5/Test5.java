import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {

        PersonP john  = new Employeee("John", 30, 50000);
        PersonP alice = new PhdStudent("Alice", 26, "AI");
        Animalz murka = new CatSub("Murka", 5);

        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println("Before vacation");
        System.out.println(registry);

        john.leavePetWith(alice);

        System.out.println("John on vacation (Alice caretakes)");
        System.out.println(registry);

        john.retrievePetFrom(alice);

        System.out.println("John back home");
        System.out.println(registry);

        PersonP bob = new Employeee("Bob", 35, 60000);
        Animalz rex = new DogSub("Rex", 3);
        bob.assignPet(rex);

        System.out.println("Bob tries to leave Rex with Alice (PhD)");
        try {
            bob.leavePetWith(alice);
        } catch (IllegalArgumentException e) {
            System.out.println("Blocked: " + e.getMessage());
        }




        System.out.println("Sorted people:");
        List<PersonP> people = new ArrayList<>();
        people.add(john);
        people.add(alice);
        people.add(bob);

        Collections.sort(people);

        for (PersonP p : people) {
            System.out.println(p);
        }


        System.out.println("Sorted animals:");
        List<Animalz> animals = new ArrayList<>();
        animals.add(murka);
        animals.add(rex);
        animals.add(new BirdSub("Kesha", 2));
        animals.add(new FishSub("Nemo", 1));

        Collections.sort(animals);

        for (Animalz a : animals) {
            System.out.println(a);
        }       


        
    }
}