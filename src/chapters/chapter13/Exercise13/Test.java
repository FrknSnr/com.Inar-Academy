package chapters.chapter13.Exercise13;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Course course = new Course("Fen");
        Course course1 = (Course) course.clone();

        course.addStudent("Furkan");
        course1.addStudent("Fatih");
        System.out.println(course.equals(course1));

        System.out.println(course.toString());
        System.out.println(course1.toString());

    }
}
