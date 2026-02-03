public class StartTriangle {
//     Write a class StarTriangle that can be used to generate the following triangular
// shape :
    private int width;

    public StartTriangle(int width){
        this.width = width;
    }

    public String buildTriangle(){
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i <= width;i++){
            for(int j = 0; j < i;j++){
                sb.append("[*]");
            }
            if(i!=width){
                sb.append("\n");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        StartTriangle st1 = new StartTriangle(3);
        System.out.println(st1.buildTriangle());
    }
}
