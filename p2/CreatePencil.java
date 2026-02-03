public class CreatePencil {
    public static void main(String[] args) {
        
        Pencil p1 = new Pencil();
        p1.numberOfPencils++;
        System.out.println(p1.numberOfPencils);

        Pencil p2 = new Pencil();
        p2.numberOfPencils++;
        System.out.println(p2.numberOfPencils);
    }
}
