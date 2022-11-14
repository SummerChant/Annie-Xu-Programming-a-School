import java.util.ArrayList;

public class Main {
    
public static void main(String[] args) {

    ArrayList<Teacher> tL = new ArrayList<>();
    ArrayList<Student> sL = new ArrayList<>();
    School MarvelSchool = new School(tL, sL, "MarvelSchool", 1963, "000000");

    Teacher Howard = new Teacher("Howard", "Stark", "Computer Science");
    MarvelSchool.addTeacher(new Teacher("Hank", "Pyms", "Physics"));
    MarvelSchool.addTeacher(new Teacher("Carol", "Danvers", "Flying"));
    MarvelSchool.addTeacher(Howard);

    Student Loki = new Student("Loki", "Laufeyson",98);
    MarvelSchool.addStudent(new Student("Peter", "Parker", 100));
    MarvelSchool.addStudent(new Student("Tony", "Stank", 100));
    MarvelSchool.addStudent(new Student("Steve", "Rogers", 82));
    MarvelSchool.addStudent(new Student("Bucky", "Barnes", 51));
    MarvelSchool.addStudent(new Student("Natasha", "Romanov", 100));
    MarvelSchool.addStudent(new Student("Bruce", "Banner", 100));
    MarvelSchool.addStudent(new Student("Clint", "Barton",92));
    MarvelSchool.addStudent(new Student("Thor", "Odinson", 23));
    MarvelSchool.addStudent(new Student("Stephen", "Strange", 100));
    MarvelSchool.addStudent(Loki);

    System.out.println("Full List of Teachers");
    MarvelSchool.showTeacher();
    System.out.println("Full List of Students");
    MarvelSchool.showStudent();

    System.out.println("List of Teachers with Howard removed");
    MarvelSchool.delTeacher(Howard);
    MarvelSchool.showTeacher();
    System.out.println("List of Teachers with Loki removed");
    MarvelSchool.delStudent(Loki);
    MarvelSchool.showStudent();
}

}