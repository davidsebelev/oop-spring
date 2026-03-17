public abstract class Character extends GameObject{
    private int health;

    public Character(String name, int health){
        super(name);
        this.health = health;
    }

    public int getHealth(){return health;}

    public void setHealth(int health){this.health = health;}


}