import java.util.ArrayList;
import java.util.List;

public class PersonRegistry {
    private List<PersonP> people = new ArrayList<>();

    public void addPerson(PersonP p){ people.add(p); }
    public void removePerson(PersonP p){ people.remove(p); }

    public List<PersonP> getPeopleWithPets() {
        List<PersonP> res = new ArrayList<>();
        for (PersonP p : people)
            if (p.hasPet()) res.add(p);
        return res;
    }

    public List<PersonP> getPeopleWithoutPets() {
        List<PersonP> res = new ArrayList<>();
        for (PersonP p : people)
            if (!p.hasPet()) res.add(p);
        return res;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("=== Registry ===\n");
        for (PersonP p : people)
            sb.append("  ").append(p).append("\n");
        return sb.toString();
    }
}