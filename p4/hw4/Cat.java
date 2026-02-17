public class Cat extends Animal {
    public Cat(String name,String typeAn){
        super(name,typeAn);
    }

    public Cat(){
        super();
    }

    public Cat(String name){
        super(name);
    }


    public String getNoise(){
        return "Cat named "+getName()+", has meow voice";
    }

    public String getType(){
        return "Cats "+getName()+" and its type is "+getTypeAnimal()+""; 
    }

    public static void main(String[] args) {
        Cat c = new Cat("Dodya","White");
        Animal a = new Cat("Barsik");
        System.out.println(c.getNoise());
        System.out.println(c.getType());
        System.out.println(a.getNoise());
    }
}
