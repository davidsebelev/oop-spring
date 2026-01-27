package hw1;
import java.util.Scanner;

public class ProblemSix {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        String word = input.next();

        palindrome(word);
    }

    public static void palindrome(String word){
        String reversedWord = "";

        for(int i = word.length()-1 ; i >= 0;i--){
            reversedWord+=word.charAt(i);
        }

        if(reversedWord.equals(word)){
            System.out.println("Yes,its palindrome");
        }else{
            System.out.println("No,its not");
        }
    }


    
}
