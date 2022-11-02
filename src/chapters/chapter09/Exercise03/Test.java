package chapters.chapter09.Exercise03;


import java.util.Arrays;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        Date date = new Date();

        for (int i = 4; i < 12; i++) {
            date.setTime((long)Math.pow(10,i));
            System.out.println(date.toString());
        }

    }

}
