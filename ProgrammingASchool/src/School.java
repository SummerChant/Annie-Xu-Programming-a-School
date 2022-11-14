import java.util.ArrayList;

public class School {
private ArrayList<Teacher> teacherList;
private ArrayList<Student> studentList;
private String schoolName;
private int schoolFoundDate;
private String schoolPostCode;

School(){
    teacherList = new ArrayList<>();
    studentList = new ArrayList<>();
    schoolName = "";
    schoolFoundDate = 1900;
    schoolPostCode = "";
}

School(ArrayList<Teacher> teacherList, ArrayList<Student> studentList, String schoolName, int schoolFoundDate, String schoolPostCode){
    this.teacherList = teacherList;
    this.studentList = studentList;
    this.schoolName = schoolName;
    this.schoolFoundDate = schoolFoundDate;
    this.schoolPostCode = schoolPostCode;
}

public ArrayList<Teacher> getTeacherList() {
    return teacherList;
}

public void setTeacherList(ArrayList<Teacher> teacherList) {
    this.teacherList = teacherList;
}

public ArrayList<Student> getStudentList() {
    return studentList;
}

public void setStudentList(ArrayList<Student> studentList) {
    this.studentList = studentList;
}

public String getSchoolName() {
    return schoolName;
}

public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
}

public int getSchoolFoundDate() {
    return schoolFoundDate;
}

public void setSchoolFoundDate(int schoolFoundDate) {
    this.schoolFoundDate = schoolFoundDate;
}

public String getSchoolPostCode() {
    return schoolPostCode;
}

public void setSchoolPostCode(String schoolPostCode) {
    this.schoolPostCode = schoolPostCode;
}

// add a Teacher to the List of Teachers
public void addTeacher(Teacher teacher){
    this.teacherList.add(teacher);
}

// add a Student to the List of Student
public void addStudent(Student student){
    this.studentList.add(student);
}

// delete a Teacher from the List of Teachers
public void delTeacher(Teacher teacher){
    for(int i = 0; i < teacherList.size(); i++){
        if(this.teacherList.get(i) == teacher){teacherList.remove(i);};
    }
}

// delete a Student from the List of Students
public void delStudent(Student student){
    for(int i = 0; i < studentList.size(); i++){
        if(this.studentList.get(i) == student){studentList.remove(i);};
    }
}

// show the names of all the Teachers
public void showTeacher(){
    for(int i = 0; i < teacherList.size(); i++){
    System.out.println(teacherList.get(i));
    }
}

// show the names of all the Students
public void showStudent(){
    for(int i = 0; i < studentList.size(); i++){
        System.out.println(studentList.get(i));
        }
}

}