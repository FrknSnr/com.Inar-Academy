package chapters.chapter13.Exercise13;

public class Course implements Cloneable {

    private String courseName;
    private String[] students = new String[100];
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

    public Object clone() throws CloneNotSupportedException {
        Course cloneCourse = (Course) super.clone();
        cloneCourse.students = students.clone();
        return cloneCourse;
    }

    @Override
    public String toString() {
        String s = " ";
        for (int i = 0; i < numberOfStudents; i++) {
            s += students[i];
        }
        return s;
    }
}
