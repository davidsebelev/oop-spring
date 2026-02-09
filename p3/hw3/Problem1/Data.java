public class Data {
    private double sumOfValues;
    private double currentMax;
    private int intCount;

    Data(){
        sumOfValues = 0;
        currentMax = Double.NEGATIVE_INFINITY;
        intCount = 0;
    }

    public void setMax(double x){
        currentMax = x;
    }

    public void AddValue(double x){
        sumOfValues +=x;
        intCount++;
        if(x > currentMax){
            setMax(x);
        }
    }

    public double  getMax(){
        return currentMax;
    }

    public double getAverage(){
        if(intCount!=0){
            return (double)(sumOfValues / intCount);
        }
    return 0;
    }

    public static void main(String[] args) {

    }
}
