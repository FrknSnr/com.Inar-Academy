package chapters.chapter06;

public class Exercise14 {
    public static void main(String[] args) {
        System.out.printf("%-10s %3s\n", "i", "m(i)");
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%-10d%.4f\n", i, estimatePi(i));
        }
    }
    public static double estimatePi(int i) {
        double sum = 0;
        for (int m = 1; m <= i; m++) {
            sum += Math.pow(-1, m + 1) / (2 * m - 1);
        }
        return 4 * sum;
    }
}

