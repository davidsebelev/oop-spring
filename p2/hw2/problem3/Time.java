public class Time {
    private int hour;
    private int minute;
    private int second;
    private int[] arrUniversal = new int[3];
    private int[] arrStandart = new int[3];
    private boolean CheckAmPm = false;


    // nedd two time universal and standart , also check invalid time 
    // non-static method works with object
    // static doesnt depend on object
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int[] toUniversal(){
        int sumSec = hour * 3600 + minute*60 + second;
        this.hour = ((sumSec-(sumSec%3600))/3600)%24;
        this.minute = ((sumSec%3600)-(sumSec%3600)%60)/60;
        this.second = (sumSec%3600)%60;

        arrUniversal[0] = hour;
        arrUniversal[1] = minute;
        arrUniversal[2] = second;

        return arrUniversal;
    }

    public String getUniversal(){
        toUniversal();
        this.CheckAmPm = (arrUniversal[0] < 12);
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arrUniversal.length;i++){
            if(i + 1 != arrUniversal.length){
                if(arrUniversal[i] < 10){
                    sb.append('0');
                }
                sb.append(arrUniversal[i]).append(":");
            }else{
                if(arrUniversal[i] < 10){
                    sb.append('0');
                }
                sb.append(arrUniversal[i]);
            }
        }
        return sb.toString();
    }

    public int[] toStandart(){
        toUniversal();
        int h12 = arrUniversal[0] % 12;
        if(h12 == 0) h12 = 12;
        arrStandart[0] = h12;
        arrStandart[1] = arrUniversal[1];
        arrStandart[2] = arrUniversal[2];

        return arrStandart;

    }

    public String getStandart(){
        toUniversal();
        this.CheckAmPm = (arrUniversal[0] < 12);
        toStandart();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < arrStandart.length;i++){
            if(i + 1 != arrStandart.length){
                if(arrStandart[i] < 10){
                    sb.append('0');
                }
                sb.append(arrStandart[i]).append(":");
            }else{
                if(arrStandart[i] < 10){
                    sb.append('0');
                }
                if(this.CheckAmPm){
                    sb.append(arrStandart[i]).append(" AM");
                }else{
                    sb.append(arrStandart[i]).append(" PM");
                }
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Time tm = new Time(0,0,11110);
        System.out.println("Universal " + tm.getUniversal());
        System.out.println("Standart " + tm.getStandart());

        Time tm2 = new Time(14, 0, 0);
        System.out.println("Universal " + tm2.getUniversal());
        System.out.println("Standart " + tm2.getStandart());

    }
}
