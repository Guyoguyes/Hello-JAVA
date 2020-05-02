public class student {
    String firstName;
    String lastName;
    int graduationYear;
    double gpa;

    public student(String firstName, String lastName, int graduationYear, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationYear = graduationYear;
        this.gpa = gpa;
    }

    public void ExpectationYear(){
        this.graduationYear =  this.graduationYear + 1;
    }
}
