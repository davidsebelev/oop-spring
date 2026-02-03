public class Enty {
    private String name;
    private String surname;
    private int number;


    // constructor

    public Enty(String name,String surname,int number){
        this.name = name;
        this.surname = surname;
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return (number);
    }

    public static void main(String[] args) {
        Enty e1 = new Enty("David","Sebelev",92345);
        System.out.println(e1.getNumber());
    }
}


