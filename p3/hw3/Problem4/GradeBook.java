import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;






public class GradeBook {
    Map<Student, Integer> grades = new HashMap<>();
    Map<String,String> gradeDistMap = new HashMap<>();
    // логика такая что если баллы попадают в промежуток то счечтик++ и потом после всех проходов по оценкам мы перемножаем значок на счетчик
    // среднее исчем как обычно
    // чтобы найти лучший или худший результат думаю стоит создать две переменные потом пройтись по всем баллам фориком например
    // и таким образом выявить все что нам нужно

    private Course course;
    //private Student student;

    public void displayMessage(){
        System.out.println("Welcome to the grade book for " + course.getNameOfCourse() + "!");
        System.out.println();
    }
    // average/best/lowest grades

    public int returnBestGrade(){
        if(grades.isEmpty())return 0;
        int maxGrade = Integer.MIN_VALUE;

    for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
    int grade = entry.getValue();

    if (grade > maxGrade) {
        maxGrade = grade;
    }
    }
    return maxGrade;
    }

    
    public int[] returnCntOfGrades() {

        int[] cnt = new int[11];
    
        for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
            int grade = entry.getValue();
            
            if(grade == 100){
                cnt[10]++;
            }else{
                int index = grade/10;
                cnt[index]++;
            }
        }
        return cnt;
    }

    public void outputBarChart() {
        int[] cnt = returnCntOfGrades();

        System.out.println();
        System.out.println("Grades distribution:");

        for (int i = 0; i < 10; i++) {
            String label = String.format("%02d-%02d: ", i * 10, i * 10 + 9);
            System.out.print(label);
            for (int s = 0; s < cnt[i]; s++) System.out.print("*");
            System.out.println();
        }


        System.out.print("100: ");
        for (int s = 0; s < cnt[10]; s++) System.out.print("*");
        System.out.println();
    }

    

    public Student returnBestGradePerson(){
        if(grades.isEmpty())return null;
        int maxGrade = Integer.MIN_VALUE;
        Student bestStudent = null;

    for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
    int grade = entry.getValue();

    if (grade > maxGrade) {
        maxGrade = grade;
        bestStudent = entry.getKey();
    }
    }
    return bestStudent;
    }

    public int returnLowGrage(){
        if(grades.isEmpty())return 0;
        int minGrade = Integer.MAX_VALUE;

        for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
            int grade = entry.getValue();

            if(grade < minGrade){
                minGrade = grade;
            }
        }
        return minGrade;
    }

    public Student returnLowGragePerson(){
        if(grades.isEmpty())return null;
        int minGrade = Integer.MAX_VALUE;
        Student lowStudent = null;

        for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
            int grade = entry.getValue();

            if(grade < minGrade){
                minGrade = grade;
                lowStudent = entry.getKey();
            }
        }
        return lowStudent;
    }

    public double returnAverageGrade(){
        double sum = 0;
        double cnt = 0;

        for (Map.Entry<Student, Integer> entry : grades.entrySet()) {
            int grade = entry.getValue();
            sum +=grade;
            cnt++;
        }
        if(cnt!=0){
            return sum/cnt;
        }else{
            return 0;
        }
    }


    public void displayGradeReport(){
        if(grades.isEmpty()){
            System.out.println("No grades are available");
            return;
        }
        double averageGrade = returnAverageGrade();

        int minScore = returnLowGrage();
        Student miStudent = returnLowGragePerson();

        int maxScore = returnBestGrade();
        Student maxStudent = returnBestGradePerson();

        System.out.print("Class average is" + averageGrade);


        System.out.print("Lowest grade is " + minScore);
        if (miStudent != null) {
            System.out.print(" (" + miStudent + "). ");
        } else {
            System.out.print(". ");
        }

        System.out.print("Highest grade is " + maxScore);
        if (maxStudent != null) {
            System.out.print(" (" + maxStudent + ").");
        } else {
            System.out.print(".");
        }

        System.out.println();
        outputBarChart();
    }

    public String toString() {
        return "GradeBook for course:\n" + course + "\nStudents: " + grades.size();
    }
    
    public void addStudent(Student name, int grade){
        grades.put(name,grade);
    }

    public void addStudentGrade(Student student, int grade){
        grades.put(student, grade);
    }

    GradeBook(Course course){
        this.course = course;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student s1 = new Student("Ivan", "1");
        Student s2 = new Student("Anna", "2");
        Student s3 = new Student("David", "3");

        Course cs = new Course("Object Oriented Programming and Design", "shortly oop", 5, "Programming Principles 1 & 2");
        GradeBook gb = new GradeBook(cs);
        gb.addStudent(s1,85);
        gb.addStudent(s2,50);
        gb.addStudent(s3,95);
        gb.displayMessage();

                
    }
    
}
