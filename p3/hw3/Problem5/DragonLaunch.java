import java.util.Vector;
public class DragonLaunch {
    Vector<Person> kidnapped = new Vector<>();
    Vector<Person> result = new Vector<>();
    String willOrNot = "";

    public void kidnapPerson(Person p){
        kidnapped.add(p);
    }


    public boolean willDragonEatOrnot(){
        
        for (int i = 0; i < kidnapped.size(); i++) {
            Person current = kidnapped.get(i);
        
            if (result.isEmpty()) {
                result.add(current);
            } else {
                Person last = result.lastElement();
                if (last.getGender() == Gender.BOY && current.getGender() == Gender.GIRL) {
                    result.remove(result.size() - 1);
                } else {
                    result.add(current);
                }
            }
        }

        return !result.isEmpty();
    }
    public static void main(String[] args) {
        DragonLaunch dg = new DragonLaunch();

        dg.kidnapPerson(new Person(Gender.BOY,  "A", "A"));
        dg.kidnapPerson(new Person(Gender.GIRL, "B", "B")); 
        // dg.kidnapPerson(new Person(Gender.BOY,  "C", "C"));

        System.out.println(dg.willDragonEatOrnot()); 
    }
}
