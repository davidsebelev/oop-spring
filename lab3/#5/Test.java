import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Chocolate[] chocolates = {
            new Chocolate("Twix",50.5),
            new Chocolate("Snickers",90.0),
            new Chocolate("Mars",45.0),
            new Chocolate("Bounty",30.0)
        };

        Time[] Times = {
            new Time(12, 30, 15),
            new Time(8, 45, 10),
            new Time(23, 5, 5),
            new Time(12, 30, 10)
        };

        System.out.println("Before sorting");
        System.out.println(Arrays.toString(chocolates));
        System.out.println(Arrays.toString(Times));

        Sort.bubbleSort(chocolates);
        Sort.mergeSort(Times);
        // Sort.bubbleSort(employees);

        System.out.println("After sorting");
        System.out.println("Chocolates: " + Arrays.toString(chocolates));
        System.out.println("Times: " + Arrays.toString(Times));
        // System.out.println("Employees: " + Arrays.toString(employees));
    }
    
}
