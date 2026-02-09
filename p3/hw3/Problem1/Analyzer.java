import java.util.Scanner;
public class Analyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data d = new Data();

        while (true) {
            if (input.hasNextDouble()) {
                double value = input.nextDouble();
                d.AddValue(value);
            } else {
                String token = input.next();
        
                if (token.equals("Q") || token.equals("q")) {
                    break;
                } else {
                    System.exit(0);
                }
            }
        }
        
        System.out.println(d.getAverage());
        System.out.println(d.getMax());
    }
    
}
