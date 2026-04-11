public abstract class Circuit {
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double V);


    // power
    public double getPower(){
        return getPotentialDiff() * getCurrent();
    }

    //ohms law
    public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }
}
