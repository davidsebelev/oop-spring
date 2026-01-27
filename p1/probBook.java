import java.util.Scanner;

public class probBook {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    

    Person p = new Person();
    int ageFromUser = input.nextInt();

    p.setAge(ageFromUser);

    System.out.println(p.getAge() + " It is your age btw");
    }
}

class Person{
    private int age;


    public void setAge(int num){
        if(num < 0 || num > 90){
            System.out.println("Wrong age");
            return;
        }
        age = num;
    }

    public int getAge(){
        return age;
    }
}

class membersOfKbtu{
    private int quantity;
    
}