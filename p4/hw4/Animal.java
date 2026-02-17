public class Animal {
    private String name;
    private String typeAn;

    public Animal(String name){
        this.name = name;
        typeAn = "no type";
    }

    public Animal(){
        name = "no name yet";
        typeAn = "no type";
    }

    public String getName(){return name;}
    public String getTypeAnimal(){return typeAn;}

    public Animal(String name,String typeAn){
        this.name = name;
        this.typeAn = typeAn;
    }

    public String getNoise(){return ""+getName()+" has no voice";}

    public String getType(){return getName() + getTypeAnimal();}
    
}
//overloading and overriding we need here
// also make subclass like a cat , crocodile or smth like this

