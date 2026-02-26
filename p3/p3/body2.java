import java.util.Vector;

public class body2 {
    private long idNum;
    private String name = "empty";
    private body2 orbits;
    private static long nextID = 0;
    private static Vector<body2> bodies = new Vector<body2>();


    body2(){
        idNum = nextID++;
    }

    body2(String name, body2 orbits){
        this.name = name;
        this.orbits = orbits;
    }

    private void AddBody(){
        bodies.add(this);
    }
    
    public long getID(){return idNum;}
    public String getName(){return name;}
    public Body getOrbits(){return orbits;}



    public static void main(String[] args) {
        body2 sun = new body2("Sol",null);
        body2 earth = new body2("Earth",sun);
    }
}
