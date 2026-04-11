public class Registor extends Circuit{
    private double resistance;
    private double potentialDifference;

    Registor(double resistance){
        this.resistance = resistance;
        this.potentialDifference = 0.0;
    }

    @Override
    public double getResistance(){return resistance;}
    public double getPotentialDiff(){return potentialDifference;}
    public void applyPotentialDiff(double V) {this.potentialDifference = V;}

    public void setResistance(double resistance){this.resistance = resistance;}
    public void setPotentialDiff(double potentialDifference){this.potentialDifference = potentialDifference;}






    
    
}
