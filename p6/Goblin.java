class Goblin extends Character implements Damageable {
    public Goblin(String name, int health) {
        super(name, health);
    }

    @Override
    public void takeDamage(int damage) {
        setHealth(getHealth() - damage);
        System.out.println(""+getName()+"  takes damage  damage. Health: " +getHealth()+"");

        if (getHealth() <= 0) {
            die();
        }
    }

    private void die() {
        System.out.println(""+getName()+" died");
    }
}