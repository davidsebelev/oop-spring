public class Parallel extends Circuit {
    private Circuit c1;
    private Circuit c2;
    private double v;

    public Parallel(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {
        double r1 = c1.getResistance();
        double r2 = c2.getResistance();
        return (r1 * r2) / (r1 + r2);
    }

    @Override
    public void applyPotentialDiff(double v) {
        this.v = v;
        c1.applyPotentialDiff(v);
        c2.applyPotentialDiff(v);
    }

    @Override
    public double getPotentialDiff() {
        return v;
    }
}