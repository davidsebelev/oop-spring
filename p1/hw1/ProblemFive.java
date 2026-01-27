package hw1;
import java.util.Scanner;

// Write a program that adds interest to a saving account and prints the
// information about the new balance on the console screen.

// we need money count , time and procents 

public class ProblemFive {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        double moneyCount = input.nextDouble();
        double time = input.nextDouble();
        double procents = input.nextDouble();

        System.out.println("Money what you will receive");
        System.out.println(NewMoneyCount(moneyCount,time,procents));
        System.out.println("Money att all");
        System.out.println(NewMoneyCount(moneyCount,time,procents) + moneyCount);


    }
    

    public static double NewMoneyCount(double money, double time, double procents){
        return money * (procents/100) * time;
    }
}
