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

        Students s1 = new Students("Student A", "1");
        Students s2 = new Students("Student B", "4");
        Students s3 = new Students("Student C", "7");
        Students s4 = new Students("Student D", "87");
        Students s5 = new Students("Student E", "12");
        Students s6 = new Students("Student F", "33");
        Students s7 = new Students("Student G", "21");
        Students s8 = new Students("Student H", "9");
        Students s9 = new Students("Student I", "15");
        Students s10 = new Students("Student J", "2");

        Students[] students = {s1,s2,s3,s4,s5,s6,s7,s8,s9,s10};

        GradeBook gb = new GradeBook(cs);

        gb.displayMessage();
        System.out.println("Please, input grades for students:");

        for (Students st : students) {
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
