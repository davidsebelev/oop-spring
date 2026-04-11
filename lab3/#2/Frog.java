public class Frog implements Jumpable{

    @Override
    public void move() { System.out.println("Frog is crawling"); }
    
    @Override
    public void Jumpable(){
        System.out.println("Frog is jumping");
    }
    
}
