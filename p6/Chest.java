 public class Chest extends GameObject implements Pushable, Interactable {
    private boolean opened;

    public Chest(String name) {
        super(name);
        this.opened = false;
    }

    public boolean isOpened() {
        return opened;
    }

    @Override
    public void push() {
        System.out.println(""+getName()+" is pushed a little.");
    }

    @Override
    public void interact() {
        if (!opened) {
            opened = true;
            System.out.println(""+getName()+" is now open!");
        } else {
            System.out.println(""+getName()+" is already open.");
        }
    }
}