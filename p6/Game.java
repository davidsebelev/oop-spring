public class Game {
    public static void main(String[] args) {
        KnightS knight = new KnightS("Arthur", 100, 25);
        Goblin goblin = new Goblin("Goblin", 40);
        WoodenBox box = new WoodenBox("Wooden Box");
        Rock rock = new Rock("Rock");
        Chest chest = new Chest("Treasure Chest");

        System.out.println("Attack Goblin");
        knight.attack(goblin);
        knight.attack(goblin);

        System.out.println("\nAttack Wooden Box");
        knight.attack(box);

        System.out.println("\nPush Objects");
        knight.push(box);
        knight.push(rock);
        knight.push(chest);

        System.out.println("\nInteract with Chest");
        knight.interact(chest);
        knight.interact(chest);
    }
}