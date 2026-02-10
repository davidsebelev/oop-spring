import java.util.Scanner;

public class Prob2 {
    private static int count = 0;    
    private final String id;          
    private String firstName;
    private String lastName;


    {
        count++; 
    }

    public Prob2(String id, String firstName, String lastName) {
        this.id = id;                
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String fullName() {
        return firstName + " " + lastName;
    }

    public String fullName(boolean upper) {
        String name = fullName();
        return upper ? name.toUpperCase() : name;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter id: ");
        String id = input.next();

        System.out.print("Enter first name: ");
        String f = input.next();

        System.out.print("Enter last name: ");
        String l = input.next();

        Prob2 user = new Prob2(id, f, l);

        System.out.println("Full name: " + user.fullName());
        System.out.println("Users created: " + Prob2.getCount());

        input.close();
    }
}