package chapters.chapter10.Exercise22;

public class Test {
    public static void main(String[] args) {

        String sss = "furkan";
        char[] ch = {'A','B','C'} ;
        MyString1 s = new MyString1(new char[]{'A','B','C'});

        System.out.println(s.charAt(2));
        System.out.println(s.equals(new MyString1(ch)));
        System.out.println(s.length());
        System.out.println(MyString1.valueOf(3500000));
        System.out.println(s.equals(new MyString1(sss.toCharArray())));
        System.out.println(s.toLowerCase());
        System.out.println(s);
    }
}
