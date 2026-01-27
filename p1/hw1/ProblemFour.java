package hw1;
import java.util.Scanner;

// Write a program to find the roots of quadratic equation. Use Scanner in order
// to get a,b,c parameters from user input.

public class ProblemFour{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        double[] roots = QuadraticEquation(a,b,c);
        System.out.println(roots[0]);
        System.out.println(roots[1]);
        
    }

    public static double[] QuadraticEquation(double a , double b, double c){
        double x1,x2;

        double d = b*b - 4 * a * c;
        x1 = (-b+Math.sqrt(d))/(2*a); 
        x2 = (-b-Math.sqrt(d))/(2*a); 

        return new double[]{x1,x2};
    }

}