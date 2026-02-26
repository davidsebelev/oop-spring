// public class ExtendedShow extends SuperShow {
//     public String str = "ExtendedStr";

//     public void show(){
//         System.out.println("Extended show" + str);
//     }

//     public static void main(String[] args) {
//         ExtendedShow ext = new ExtendedShow();
//         SuperShow sup = ext;

//         sup.show();
//         ext.show();

//         System.out.println("sup.str = " + sup.str);
//         System.out.println("ext.str = " + ext.str);
//     }
// }

// Через маску родителя видны только родительские переменные.

// Но действия (методы) объект всё равно выполняет так, как его научили в его родном классе (ExtendedShow).
