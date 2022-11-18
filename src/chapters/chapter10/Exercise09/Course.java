package chapters.chapter10.Exercise09;

import java.util.Arrays;

public class Course {

    private String courseName;
    private String[] students = new String[7];
    private int numberOfStudents;


    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (student.equals(students[i])) {
                index = i;
            }
        }
        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
    }

    public void clear() {
        students = new String[7];
    }

    public void display() {
        System.out.print("( ");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null){
                System.out.printf("%s%s",students[i]," ");
            }
        }
        System.out.println(")");
    }
}
