import java.util.Scanner;
public class first
{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);

		// int num1,num2,sum,x;
        // double radius,res;
        // final int MAX = 10000;

		// num1 = input.nextInt();
        // num2 = input.nextInt();
        // x = input.nextInt();
        // radius = input.nextDouble();


        // sum = num1 + num2 + x;
        // res = sum * radius;
        
        // System.out.println(res);


        // boolean flag = true;
        // boolean flagSecond = false;


        // if(flag || flagSecond)System.out.println("Руслан гей");
        // else System.out.println("Руслан не гей");

        int day = input.nextInt();

        switch(day){
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesay");
            break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thursday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            case 7:System.out.println("Sunday");
            break;
            default:System.out.println("Wrong day");
        }

        int someNum = 35;
        int anotherNum = 0;

        // while(anotherNum < someNum){
        //     anotherNum+=5;
        //     System.err.println("Женя лох");
        // }

        do{
            System.out.println("Саня гей");
            anotherNum+=5;
        }while(anotherNum < someNum);

        String word = input.next();
        String temp = "";

        for(int i = word.length()-1 ; i >= 0;i--){
            temp+=word.charAt(i);
        }

        if(temp.equals(word)){
            System.out.println("Макс жестокий гей");
        }else{
            System.out.println("he is not(((");
        }
        
        int x = 502065;
        int y = 542364236;

        int result = m0x(x, y);
        System.out.println(result);


	}


    public static int m0x(int x, int y){
        if(x > y){
            return x;
        }else{
            return y;
        }
    }
}