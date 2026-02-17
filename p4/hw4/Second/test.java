import java.util.Vector;
import java.util.Scanner;

public class test {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Person> people = new Vector<Person>();

        while (true) {
        System.out.println("1 - Add");
        System.out.println("2 - Print");
        System.out.println("0 - Exit");

        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("1 - Person");
            System.out.println("2 - Student");
            System.out.println("3 - Staff");

            int type = sc.nextInt();
            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Address: ");
            String address = sc.nextLine();

            

            if(type == 1){
                people.add(new Person(name, address));
            }else if(type == 2){
                System.out.println("Year: ");
                int year = sc.nextInt();

                sc.nextLine();

                System.out.println("Program: ");
                String program = sc.nextLine();


                System.out.println("Fee: ");
                double fee = sc.nextDouble();


                people.add(new Student(name, address,program,year,fee));
            }else if(type == 3){
                // sc.nextLine();

                System.out.println("School: ");
                String school = sc.nextLine();

                System.out.println("Pay: ");
                double pay = sc.nextDouble();

                people.add(new Staff(name, address, school, pay));
            }
        }

        else if(choice == 2){
            if(people.isEmpty()){
                System.out.println("There is no people!");
            }else{
                for (Person p : people) {
                    System.out.println(p);
                }
            }
        }
        else if(choice == 0){
            break;
        }

        }

        sc.close();

    }
}
