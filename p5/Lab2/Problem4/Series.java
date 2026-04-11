public class Series extends Circuit {
    private Circuit c1;
    private Circuit c2;
    private double v; 

    public Series(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {
        return c1.getResistance() + c2.getResistance();
    }

    @Override
    public void applyPotentialDiff(double v) {
        this.v = v; 
        double current = getCurrent(); 
        
        c1.applyPotentialDiff(current * c1.getResistance());
        c2.applyPotentialDiff(current * c2.getResistance());
    }

    @Override
    public double getPotentialDiff() {
        return v;
    }
}