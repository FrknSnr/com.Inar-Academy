package chapters.chapter11.Exercise05;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {

    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
        numberOfStudents--;

    }

    public String toString() {
        String s = "";
        for (int i = 0; i < students.size(); i++) {
            s += students.get(i) + " / ";
        }
        return s;
    }
}

class Test {
    public static void main(String[] args) {
        Course course = new Course("Fusebe");
        course.addStudent("Berk");
        course.addStudent("Serhat");
        course.addStudent("Furkan");
        System.out.println(course);
        course.dropStudent("Furkan");
        System.out.println(course);
        System.out.println(course.getCourseName());
        System.out.println(course.getNumberOfStudents());

    }
}
