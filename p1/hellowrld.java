public class hellowrld {
    private String greeting = "Hello world!";

    public void greet(){
        System.out.println(greeting);
    }

    public static void main(String[] args){
        hellowrld hw = new hellowrld();
        hw.greet();
        System.out.println(hw.max(10, 20));
    } 

    public static int max(int x , int y){
        if(x > y ){
            return x;
        }else{
            return y;
        }
    }
}

//Rules for naming 
// Class names capitalize letters of each word - HelloWord
// Variable or method name begin with lowercase and then uppercase getName()
// Constants capitalize all letters MAX for ex

