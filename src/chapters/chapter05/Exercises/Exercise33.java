package chapters.chapter05.Exercises;

public class Exercise33 {

    public static void main(String[] args) {

        for (int i = 1; i < 10_000; i++) {
            int total = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    total += j;
                }

            }
            if (total == i) {
                System.out.println(i + " is a perfect number. ");
            }
        }


    }
}
