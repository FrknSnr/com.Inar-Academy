package chapters.chapter10.Exercise01;


public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        second = (int) ((elapseTime / 1000) % 60);
        minute = (int) (elapseTime / (1000 * 60) % 60);
        hour = (int) (elapseTime / (1000 * 60 * 60) % 24);
    }

}