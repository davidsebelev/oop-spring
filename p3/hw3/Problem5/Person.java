public class Person {
    Gender gender;
    private String  firstname;
    private String lastname;

    Person(Gender gender, String firstname, String lastname){
        this.gender = gender;
        this.firstname = firstname;
        this.lastname = lastname;

    }


    public String getFullName(){
        return firstname + " " + lastname;
    }

    public Gender getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return getFullName() + " (" + gender + ")";
    }


    
}
