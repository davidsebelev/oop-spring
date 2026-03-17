public class WoodenBox extends GameObject implements Damageable, Pushable {
    private boolean broken;

    public WoodenBox(String name) {
        super(name);
        this.broken = false;
    }

    public boolean isBroken() {
        return broken;
    }

    @Override
    public void takeDamage(int damage) {
        if (!broken) {
            broken = true;
            System.out.println(""+getName()+" was hit and broke immediately!");
            destroy();
        } else {
            System.out.println(""+getName()+"  is already broken.");
        }
    }

    @Override
    public void push() {
        if (!broken) {
            System.out.println(""+getName()+" is pushed to another position.");
        } else {
            System.out.println(""+getName()+" is broken and cannot be pushed properly.");
        }
    }

    private void destroy() {
        System.out.println(""+getName()+"  is destroyed");
    }
}