import java.util.*;

public class Example4
{
    public static void main(String[] args)
    {
       double                 leftOperand =0.0, result=0.0, rightOperand=0.0;
       String                 leftString, operator, rightString;
       StringTokenizer        tokenizer;
       Boolean                valid = true;
       Scanner in = new Scanner(System.in);


       tokenizer = new StringTokenizer(in.nextLine(), "+*-/ ", true);

       while(tokenizer.hasMoreTokens()){
         valid = true;
         leftString = tokenizer.nextToken();
         if(leftString.trim().isEmpty()){
            continue;
         }
         try
       {
         //  leftString   = tokenizer.nextToken();
          operator     = tokenizer.nextToken();
          rightString  = tokenizer.nextToken();

         
          try{
            leftOperand  = Double.parseDouble(leftString);
          }catch(NumberFormatException nfe){
            System.out.println("left operand is not a number");
            valid = false;
          }

          try{
            rightOperand  = Double.parseDouble(rightString);
          }catch(NumberFormatException nfe){
            System.out.println("right operand is not a number");
            valid = false;
          }

          if(valid){
            switch (operator) {
               case "+":
                  result = leftOperand + rightOperand;
                  break;
               case "*":
                  result = leftOperand * rightOperand;
                  break;
               case "-":
                  result = leftOperand - rightOperand;
                  break;
               case "/":
                  result = leftOperand / rightOperand;
                  break;
               default:
                  result = 0.0;
                  break;
             }

             System.out.println("Result: " + result);
            
          }


       }
       catch (NoSuchElementException nsee)
       {
          System.out.println("Invalid syntax");
       }
       catch (NumberFormatException nfe)
       {
          System.out.println("One or more operands is not a number");
       }
         
       }


       


    }
}
