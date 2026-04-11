public class Plane implements Flyable{

    @Override
    public void move() { System.out.println("Plane is taxiing on the runway"); }

    @Override
    public void fly(){
        System.out.println("Plane is flying");
    }
    
}
