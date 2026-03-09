import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Brawler> set = new HashSet<>();

        Brawler b1 = new Brawler("El Primo", "Tank", "Melee", 500, 11, 6000.0, 360.0);

        Piper p1 = new Piper("Piper", "Epic", "Sniper", "Damage Dealer", 600, 11, 2400.0, 1700.0);
        Piper p2 = new Piper("Piper", "Epic", "Sniper", "Damage Dealer", 600, 11, 2400.0, 1700.0);

        set.add(b1);
        set.add(p1);
        set.add(p2);

        System.out.println(set.size());

        if(p1.equals(p2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        for(Brawler b : set){
            System.out.println(b);
        }
    }
    
}
