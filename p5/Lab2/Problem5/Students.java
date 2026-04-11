public class Students extends PersonP {
    private String major;
    private String university;
    private String yearOfStudy;

    public Students(String name, int age, String major, String university, String yearOfStudy) {
        super(name, age);
        this.major = major;
        this.university = university;
        this.yearOfStudy = yearOfStudy;
    }

    public String getMajor(){ return major; }
    public String getUniversity(){ return university; }
    public String getYearOfStudy(){ return yearOfStudy; }

    @Override
    public String getOccupation() {return "Student at " + university + ", major: " + major + ", year: " + yearOfStudy;}
}