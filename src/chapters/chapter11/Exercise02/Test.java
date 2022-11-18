package chapters.chapter11.Exercise02;

import chapters.chapter10.Exercise14.MyDate;

public class Test {

    public static void main(String[] args) {

        Person person = new Person("Furkan","bagcilar","34-34-34-34","furkansener@gmail.com");
        System.out.println(person);
        Student student = new Student("Ali","mecidiyekoy","44-44-44","aliyaman@com",1);
        System.out.println(student);
        Employee employee = new Employee("Bla","adc","123","adf","asf",123, new MyDate());
        System.out.println(employee);
        Faculty faculty = new Faculty("itu","itu","asg","asr","sasaf",1232412, new MyDate(),5,89);
        System.out.println(faculty);
        Staff staff = new Staff("ffff","sss","asf","wer","wet",78,new MyDate(),"ttttt");
        System.out.println(staff);
    }
}
