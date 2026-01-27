package hw1;
import java.util.Scanner;

public class PrintMyName {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);//Получает имя

        String name = input.next();

        System.out.println("+---+");
        System.out.println("|" + name + "|" );
        System.out.println("+---+");


    }
}
