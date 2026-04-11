public interface Moveable {public void move();}

public interface Flyable extends Moveable{public void fly();}

public interface Jumpable extends Moveable{public void jump();}

public class Carr implements Moveable{

    @Override
    public void move() {System.out.println("Car is running");}
}
