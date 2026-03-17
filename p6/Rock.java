public class Rock extends GameObject implements Pushable {
    public Rock(String name) {
        super(name);
    }

    @Override
    public void push() {
        System.out.println(""+getName()+" is pushed with difficulty.");
    }
}