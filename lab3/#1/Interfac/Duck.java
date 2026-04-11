public interface Swimmable{
    void swim();
}


public class Duck implements Movable{
    public void swim(){
        System.out.println("Duck is swimming");
    }
    
}
