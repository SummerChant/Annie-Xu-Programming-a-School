public class Student{
    private String firstName;
    private String lastName;
    private int grade;
    static int studentNum = 1;
    
    Student(){
    firstName = "";
    lastName = "";
    grade = 0;
    studentNum++;
    }

    Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName =  lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    // print out the Name and Grade of the student

    public String toString(){
        return "Name: " + this.firstName + " " + this.lastName + " Grades: " + this.grade;
    }

}