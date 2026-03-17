public class KnightS extends Character{
    private int swordDamage;

    public KnightS(String name, int health, int swordDamage){
        super(name,health);
        this.swordDamage = swordDamage;
    }

    public int getSwordDamage(){return swordDamage;}

    public void attack(Damageable target){
        System.out.println(""+getName()+" attacks");
        target.takeDamage(getSwordDamage());
    }

    public void push(Pushable target){
        System.out.println(""+getName()+" pushs "+((GameObject) target).getName()+"");
        target.push();
    }

    public void interact(Interactable target) {
        System.out.println(""+getName()+" interacts with"+((GameObject) target).getName()+"");
        target.interact();
    }

    
}
