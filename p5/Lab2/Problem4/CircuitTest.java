public class CircuitTest {
    public static void main(String[] args) {

        Circuit a = new Registor(3.0);
        Circuit b = new Registor(3.0);
        Circuit c = new Registor(6.0);
        Circuit d = new Registor(3.0);
        Circuit e = new Registor(2.0);


        Circuit f = new Series(a, b); 
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit mainCircuit = new Parallel(h, f);




        double totalR = mainCircuit.getResistance();
        System.out.println("Проверка сопротивления");
        System.out.println("Общее сопротивление схемы: " + totalR + " Ом");
        System.out.println();


        double inputVoltage = 12.0;
        mainCircuit.applyPotentialDiff(inputVoltage);

        System.out.println("Проверка напряжений и токов");
        System.out.println("Общий ток в системе: " + mainCircuit.getCurrent() + " А");
        System.out.println("Общая мощность: " + mainCircuit.getPower() + " Вт");
        
 
        System.out.println("Напряжение на резисторе 'a': " + a.getPotentialDiff() + "");
        System.out.println("Напряжение на резисторе 'b': " + b.getPotentialDiff() + "");
        
  
        System.out.println("Напряжение на блоке 'g': " + g.getPotentialDiff() + " В");
        System.out.println("Напряжение на резисторе 'e': " + e.getPotentialDiff() + "");
        

        System.out.println("Напряжение на резисторе 'c': " + c.getPotentialDiff() + "");
    }
}