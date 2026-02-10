public class Temperature {
    private double tempValue;
    private char scale; // either C for celsius or F for farenheit

    Temperature(){
        tempValue = 0;
        scale = 'C';
    }

    Temperature(double tempValue){
        this.tempValue = tempValue;
        scale = 'C';
    }

    Temperature(char scale){
        this.scale = scale;
        tempValue = 0;
    }

    Temperature(double tempValue, char scale){
        this.tempValue = tempValue;
        this.scale = scale;
    }

    public double returnTempCel(){
        if(scale == 'C' || scale == 'c')return tempValue;
        return 5*(tempValue - 32)/9;
    }

    public double returnTempFar(){
        if(scale == 'F' || scale == 'f')return tempValue;
        return 9*(tempValue/5)+32;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setTemp(double tempValue){
        this.tempValue = tempValue;
    }

    public void setTempScale(char scale, double tempValue){
        this.scale = scale;
        this.tempValue = tempValue;
    }

    public char returnScale(){
        return scale;
    }

    public static void main(String[] args) {
        Temperature t = new Temperature(98,'F');
        System.out.println(t.returnTempCel());
        System.out.println(t.returnScale());
    }
    
}
