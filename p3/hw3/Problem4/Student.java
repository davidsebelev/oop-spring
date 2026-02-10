// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Student {
    private String studentName;
    private String studentId;
    private int yearOfStudy;
 
    public Student(String var1, String var2) {
       this.studentName = var1;
       this.studentId = var2;
       this.yearOfStudy = 1;
    }
 
    public String getName() {
       return this.studentName;
    }
 
    public String getId() {
       return this.studentId;
    }
 
    public int getYearOfStudy() {
       return this.yearOfStudy;
    }
 
    public void incrementYearOfStudy() {
       ++this.yearOfStudy;
    }
 
    public static void main(String[] var0) {
       Student var1 = new Student("David", "24B032010");
       System.out.println(var1.getName());
       System.out.println(var1.getId());
       System.out.println(var1.getYearOfStudy());
    }
 }
 