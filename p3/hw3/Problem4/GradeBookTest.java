import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Course cs = new Course(
            "CS101 Object-oriented Programming and Design",
            "OOP basics",
            5,
            "Programming Principles 1 & 2"
    );

    Student s1 = new Student("Student A", "1");
        Student s2 = new Student("Student B", "4");
        Student s3 = new Student("Student C", "7");
        Student s4 = new Student("Student D", "87");
        Student s5 = new Student("Student E", "12");
        Student s6 = new Student("Student F", "33");
        Student s7 = new Student("Student G", "21");
        Student s8 = new Student("Student H", "9");
        Student s9 = new Student("Student I", "15");
        Student s10 = new Student("Student J", "2");

        Student[] students = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};

        GradeBook gb = new GradeBook(cs);

        gb.displayMessage();
        System.out.println("Please, input grades for students:");

        for (Student st : students) {
            int grade;

            while (true) {
                System.out.print(st.getName() + ": ");
                if (!input.hasNextInt()) {
                    input.next(); 
                    System.out.println("Please enter an integer grade (0..100).");
                    continue;
                }

                grade = input.nextInt();
                if (grade < 0 || grade > 100) {
                    System.out.println("Grade must be between 0 and 100.");
                    continue;
                }
                break;
            }

            gb.addStudentGrade(st, grade);
        }

        System.out.println();
        gb.displayGradeReport();

    }
}
