package chapters.chapter10.Exercise27;

public class Test {
    public static void main(String[] args) {

        MyStringBuilder1 s = new MyStringBuilder1("FURKAN");
        System.out.println(s.toLowerCase());
        System.out.println(s.append(3));
        System.out.println(s);
        System.out.println(s.charAt(3));
        System.out.println(s.length());
        System.out.println(s.substring(0,2));
        System.out.println(s);
    }
}
