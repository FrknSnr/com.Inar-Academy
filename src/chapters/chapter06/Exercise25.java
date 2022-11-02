package chapters.chapter06;

import java.util.Scanner;

public class Exercise25 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the millisecond :");
        long millisecond = input.nextLong();
        System.out.println(convertMillis(millisecond));
    }

    public static String convertMillis(long millis) {
        long totalSeconds = millis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinute = totalSeconds / 60;
        long minutes = totalMinute % 60;
        long totalHours = totalMinute / 60;
        return totalHours + ":" + minutes + ":" + seconds;
    }

}
