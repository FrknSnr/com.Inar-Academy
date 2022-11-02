package chapters.chapter06;

public class Exercise33 {
    public static void main(String[] args) {
        current( System.currentTimeMillis() / 1000);
    }

    public static void current(long totalSeconds) {

        long currentSeconds = totalSeconds % 60 ;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long totalDays = totalHours / 24;
        long currentDay = totalDays % 30;
        long totalMonths = totalDays / 30;
        long currentMonth = totalMonths % 12 ;
        String month = "";
        switch ((int)currentMonth){
            case 0  :month += "January" ; break ;
            case 1  :month += "February" ; break ;
            case 2  :month += "March" ; break ;
            case 3  :month += "April" ; break ;
            case 4  :month += "May" ; break ;
            case 5  :month += "June" ; break ;
            case 6  :month += "July" ; break ;
            case 7  :month += "August" ; break ;
            case 8  :month += "September" ; break ;
            case 9  :month += "October" ; break ;
            case 10 :month += "November" ; break ;
            case 11 :month += "December" ; break ;
        }
        long totalYears = totalMonths / 12 ;
        long currentYear = 1970 + totalYears ;
        System.out.println("Current date and time is : "+ month + " " + currentDay + ", "+ currentYear + " " + currentHour+": "+ currentMinute+ ": "+ currentSeconds   );
    }

}
