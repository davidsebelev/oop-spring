import java.util.Objects;

public class Piper extends Brawler{
    private String rarityOfPiper;
    

    public Piper(String name,
        String rarityOfPiper, 
        String typeOfBrawler, 
        String roleOfBrawler,
        int numberOfTropheys,
        int powerOfBrawler,
        double healthOfBrawler,
        double attackOfBrawler)
        {
            super(name, typeOfBrawler, roleOfBrawler, numberOfTropheys, powerOfBrawler, healthOfBrawler, attackOfBrawler);
            this.rarityOfPiper = rarityOfPiper;
        }
    
    public String getPiperRarity(){return rarityOfPiper;}

    @Override
    public String toString(){
        return super.toString() + "Rarity is "+getPiperRarity()+".";
    }

    @Override
    public boolean equals(Object o){
        if(!super.equals(o)) return false;
        Piper piper = (Piper) o;
        return Objects.equals(piper.rarityOfPiper, rarityOfPiper);
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), rarityOfPiper);
    }
}
