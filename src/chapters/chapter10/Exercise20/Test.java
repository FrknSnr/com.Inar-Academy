package chapters.chapter10.Exercise20;

public class Test {

    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            double sum = 1;
            for (int k = 3, j = 1; k <= (2 * i - 1); k += 2, j++) {
                sum += Math.pow(-1, j) / k;
            }
            System.out.println("Pi for i => " + i + " is " + 4 * sum);
        }

        for (int i = 100; i <= 1000 ; i += 100) {
            double sum = 1;
            for (int j = 0; j < 2; j++) {
                
            }

        }
    }
}
