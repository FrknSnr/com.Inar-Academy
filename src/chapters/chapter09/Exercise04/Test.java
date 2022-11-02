package chapters.chapter09.Exercise04;

import java.util.Random;

public class Test {

    public static void main(String[] args) {

        Random random =  new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.println(i+1 + "." + random.nextInt(100));
        }
    }

}

