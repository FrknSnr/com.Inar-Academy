package chapters.chapter10.Exercise28;

public class Test {
    public static void main(String[] args) {

        MyStringBuilder2 s = new MyStringBuilder2();
        System.out.println(s);
        System.out.println(s.insert(0,new MyStringBuilder2("Furkan")));
        System.out.println(s);
        System.out.println(s.substring(3));
        System.out.println(s);
        System.out.println(s.insert(3,new MyStringBuilder2("FUR")));
        System.out.println(s.toUpperCase());
        System.out.println(s);
    }
}
