package p2.hw2.problem1;
public class Students {

//     Implement a class Student. Student has a name, id and a year of study.
// Provide a constructor with two parameters and create methods to access name, id and
// increment the year of study.

    private String studentName;
    private String studentId;
    private int yearOfStudy;

    public Students(String studentName,String studentId){
        this.studentName = studentName;
        this.studentId = studentId;
        this.yearOfStudy = 1;
    }

    // public void setName(String name){
    //     this.name = name;
    // }

    public String getName(){
        return studentName;
    }

    public String getId(){
        return studentId;
    }

    public int getYearOfStudy(){
        return yearOfStudy;
    }

    public void incrementYearOfStudy(){
        yearOfStudy++;
    }

    public static void main(String[] args) {
        Students s1 = new Students("David", "24B032010");
        System.out.println(s1.getName());
        System.out.println(s1.getId()); 
        System.out.println(s1.getYearOfStudy());  
    }
}
