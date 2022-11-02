package chapters.chapter06;

public class Exercise13 {
    public static void main(String[] args) {
        System.out.printf("%-14s%s\n", "i", "m(i)");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%-14d%.4f\n", i, computeM(i));
        }
    }
    public static double computeM(double i) {
        double result = 0;
        for (double m = 1; m <= i; m++) {
            result += m / (m + 1);
        }
        return result;
    }

}
