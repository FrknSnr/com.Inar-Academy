package chapters.chapter10.Exercise23;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        MyString2 s = new MyString2("Furkan");
        MyString2 s2 = new MyString2("FuRKan");

        System.out.println(Arrays.toString(s.toChars()));
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(s.compare("Fatih"));
        System.out.println(s.substring(2));
    }
}
