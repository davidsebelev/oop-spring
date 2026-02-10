public class Course {
    private String name;
    private String description;
    private int creditNumber;
    private String prerequisites;

    Course(String name, String description, int creditNumber, String prerequsites){
        this.name = name;
        this.description = description;
        this.creditNumber = creditNumber;
        this.prerequisites = prerequsites;
    }

    public String getNameOfCourse(){return name;}
    public String  getDescOfCourse(){return description;}
    public int  getCreditNumOfCourse(){return creditNumber;}
    public String  getPrereqOfCourse(){return prerequisites;}

    @Override
    public String toString() {
        return "Course name: " + name +
               "\nDescription: " + description +
               "\nCredits: " + creditNumber +
               "\nPrerequisites: " + prerequisites;
    }
}
