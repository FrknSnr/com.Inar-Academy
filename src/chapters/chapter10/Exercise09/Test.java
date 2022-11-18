package chapters.chapter10.Exercise09;

public class Test {

    public static void main(String[] args) {

        Course c1 = new Course("SNR");
        c1.addStudent("FURKAN");
        c1.addStudent("BERK");
        c1.addStudent("SERHAT");
        c1.dropStudent("FURKAN");
        c1.display();
    }
}
