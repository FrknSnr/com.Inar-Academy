package chapters.chapter10.Exercise01;

public class Test {
    public static void main(String[] args) {

        Time time1 = new Time();
        Time time2 = new Time(555550000);
        displayTime(time1);
        displayTime(time2);
    }

    public static void displayTime(Time time) {
        System.out.println("Firs time : " + (time.getHour() < 10 ? "0" + time.getHour() : time.getHour()) + " : "
                + (time.getMinute() < 10 ? "0" + time.getMinute() : time.getMinute()) + " : " +
                (time.getSecond() < 10 ? "0" + time.getSecond() : time.getSecond()));
    }
}
