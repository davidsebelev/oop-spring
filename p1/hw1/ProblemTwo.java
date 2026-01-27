package hw1;
import java.util.Scanner;
// Create a program to calculate an area, perimeter, and the length of diagonal
// of a square with a side a,

public class ProblemTwo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        
        System.out.println(Area(number));
        System.out.println(Perimeter(number));
        System.out.println(LengthOfDiagonal(number));
    }

    public static int Area(int a){
        return a * a;
    }

    public static int  Perimeter(int a){
        return 4 * a;
    }

    public static double LengthOfDiagonal(int a){
        return a * Math.sqrt(2);
    }

}

