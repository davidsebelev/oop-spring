import java.util.Vector;
import java.util.Scanner;


public class TestCuCySh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Shape3D> shapes = new Vector<Shape3D>();

        System.out.println("Hello! lets get started, choose what we will do");

        while(true){
            System.out.println("1 - Add");
            System.out.println("2 - Print");
            System.out.println("0 - Exit");

            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println("Which figure you want to choose?");

                System.out.println("1-Cube");
                System.out.println("2-Cylinder");
                System.out.println("3-Sphere");

                int choiceFigure = sc.nextInt();

                if(choiceFigure == 1){
                    System.out.println("Add side for Cube");
                    double side = sc.nextDouble();

                    shapes.add(new Cube(side));
                }else if(choiceFigure == 2){
                    System.out.println("Add height and radius for Cylinder");

                    double radius = sc.nextDouble();

                    double height = sc.nextDouble();

                    shapes.add(new Cylinder(radius,height));
                }else if(choiceFigure == 3){
                    System.out.println("Add radius for Sphere");

                    double radius = sc.nextDouble();

                    shapes.add(new Sphere(radius));
                }else{
                    System.out.println("Wrong figure choice!");
                }
            }else if(choice == 2){
                if(shapes.isEmpty()){
                    System.out.println("There is no shapes!");
                }else{
                    for (Shape3D sh : shapes) {
                        System.out.println(sh.toString());
                    }
                }
            }else if(choice == 0){
                break;
            }else{
                System.out.println("Wrong menu choice!");
            }
        }
        sc.close();
    }
    
}
