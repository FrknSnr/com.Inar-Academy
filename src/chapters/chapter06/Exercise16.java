package chapters.chapter06;

public class Exercise16 {
    public static void main(String[] args) {
        for (int i = 2000; i <= 2020; i++) {
            System.out.printf("%-8d%d\n", i, numberOfDaysInAYear(i));
        }
    }
    public static int numberOfDaysInAYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 366 : 365;
    }
}
