package hw1;
import java.util.Scanner;
// Write a program that displays a grade (A, A-, B+…) according to a number
// that a user enters on the console screen.


public class ProblemThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        
        if (number >= 95 && number <= 100) {
            System.out.println("A");
        } else if (number >= 90) {
            System.out.println("A-");
        } else if (number >= 85) {
            System.out.println("B+");
        } else if (number >= 80) {
            System.out.println("B");
        } else if (number >= 75) {
            System.out.println("B-");
        } else if (number >= 70) {
            System.out.println("C+");
        } else if (number >= 65) {
            System.out.println("C");
        } else if (number >= 60) {
            System.out.println("C-");
        } else if (number >= 55) {
            System.out.println("D+");
        } else if (number >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
    }

}
