import java.util.*;
enum Role{
    user,
    vip,
    admin
}



//Class PascalCase
//methods getName setName and etc
// const MAX_USER_INT all in upper case
// enum also in PascalCase

public abstract class some {
    private int age;
    private String name;

    {
        System.out.println("Init block executed");

    }

    public some(int age, String name){
        this.age = age;
        this.name = name;
    }

    public some(String name){
        this(name,18);
    }

    public String getName(){
        return name;
    }

    public int getAge(){return age;}

    final String getHello(){
        return "Hello "+getName()+"";
    }

    static int getInt(){
        return 50;
    }  

    public abstract double getSalary();

    //concrete это просто обычный метод у которого есть реализация

    public final String breathe(){
        return "bla";
    }
    // нельзя override

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();

    String name = sc.next();

    int numbers[] = new int[10];
    for (int i = 0; i < numbers.length; i++) {
    numbers[i] = sc.nextInt(); // Записываем в каждую ячейку
}

    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 3; i++) {
        int input = sc.nextInt();
        list.add(input); // Метод .add() добавляет в конец
    }

    HashSet<String> hashSet = new HashSet<>();
    for (int i = 0; i < 4; i++) {
        String s = sc.next();
        names.add(s); 
    }

    HashMap<String, Integer> items = new HashMap<>();
System.out.println("Введите 3 пары (Название товара и его цена):");

for (int i = 0; i < 3; i++) {
    String key = sc.next();    // Например, "Apple"
    int value = sc.nextInt();  // Например, 100
    items.put(key, value);     // Метод .put() для записи пары
}

String word = "Программа";

for (int i = 0; i < word.length(); i++) {
    char letter = word.charAt(i); // Получаем букву по индексу
    System.out.println("Буква на позиции " + i + ": " + letter);
}
    //Cat cat = new Cat();
    // Animal animal = cat // upcasting

    //Animal animal = new Cat();
    // Cat cat = (Cat) animal // downcasting


    Animal myAnimal = new Dog(); // Upcasting (автоматически)

    // Мы хотим вызвать метод bark(), который есть только у Dog
    // Но Java видит myAnimal просто как Animal. Нужно приведение!
    
    // if (myAnimal instanceof Dog) {
    //     Dog myDog = (Dog) myAnimal; // Явное приведение (Downcasting)
    //     myDog.bark();
    // } else {
    //     System.out.println("Это не собака, гавкать не будет.");
    // }
}
    
}

