import java.util.Objects;

public class Brawler {
    private String name;
    private String typeOfBrawler;
    private String roleOfBrawler;

    private int numberOfTropheys;
    private int powerOfBrawler;
    private double healthOfBrawler;
    private double attackOfBrawler;

    public Brawler(String name, 
        String typeOfBrawler, 
        String roleOfBrawler,
        int numberOfTropheys,
        int powerOfBrawler,
        double healthOfBrawler,
        double attackOfBrawler
    ){
        this.name = name;
        this.typeOfBrawler = typeOfBrawler;
        this.roleOfBrawler = roleOfBrawler;
        this.numberOfTropheys = numberOfTropheys;
        this.powerOfBrawler = powerOfBrawler;
        this.healthOfBrawler = healthOfBrawler;
        this.attackOfBrawler = attackOfBrawler;
    }

    public String getName(){return name;}
    public String getTypeBrawler(){return typeOfBrawler;}
    public String getRoleBrawler(){return roleOfBrawler;}

    public int getNumberOfTropheys(){return numberOfTropheys;}
    public int getPowerOfBrawler(){return powerOfBrawler;}
    public double getHealthOfBrawler(){return healthOfBrawler;}
    public double getAttackOfBrawler(){return attackOfBrawler;}
    
    public void setName(String name){this.name = name;}
    public void setTypeBrawler(String typeOfBrawler){this.typeOfBrawler = typeOfBrawler;}
    public void setRoleBrawler(String roleOfBrawler){this.roleOfBrawler = roleOfBrawler;}

    public void setNumberOfTropheys(int numberOfTropheys){this.numberOfTropheys = numberOfTropheys;}
    public void setPowerOfBrawler(int powerOfBrawler){this.powerOfBrawler = powerOfBrawler;}
    public void setHealthOfBrawler(double healthOfBrawler){this.healthOfBrawler = healthOfBrawler;}
    public void setAttackOfBrawler(double attackOfBrawler){this.attackOfBrawler = attackOfBrawler;}

    @Override
    public String toString(){return "Brawler name is "+getName()+", type is "+getTypeBrawler()+" and role is "+getRoleBrawler()+". Brawler having "+getNumberOfTropheys()+" tropheys , "+getPowerOfBrawler()+" power. Brawler health is "+getHealthOfBrawler()+" and attack is "+getAttackOfBrawler()+".";}

    @Override
    public boolean equals(Object brawlObject){
        if(this == brawlObject) return true;
        if(brawlObject == null || getClass() != brawlObject.getClass()) return false;
        Brawler brawler = (Brawler) brawlObject;
        return Objects.equals(name, brawler.name) 
        && Objects.equals(typeOfBrawler, brawler.typeOfBrawler)
        && Objects.equals(roleOfBrawler, brawler.roleOfBrawler)
        && numberOfTropheys == brawler.numberOfTropheys && powerOfBrawler == brawler.powerOfBrawler
        && Double.compare(healthOfBrawler, brawler.healthOfBrawler) == 0 && Double.compare(attackOfBrawler, brawler.attackOfBrawler) == 0;
    }


    @Override
    public int hashCode(){return Objects.hash(name,typeOfBrawler,roleOfBrawler,numberOfTropheys,powerOfBrawler,healthOfBrawler,attackOfBrawler);}


}

