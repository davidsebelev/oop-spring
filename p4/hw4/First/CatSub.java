public class CatSub extends Animal {
    public CatSub(String name,String typeAn){
        super(name,typeAn);
    }

    public CatSub(){
        super();
    }

    public CatSub(String name){
        super(name);
    }


    public String getNoise(){
        return "Cat named "+getName()+", has meow voice";
    }

    public String getType(){
        return "Cats "+getName()+" and its type is "+getTypeAnimal()+""; 
    }

    public static void main(String[] args) {
        CatSub c = new CatSub("Dodya","White");
        Animal a = new CatSub("Barsik");
        System.out.println(c.getNoise());
        System.out.println(c.getType());
        System.out.println(a.getNoise());
    }
}
