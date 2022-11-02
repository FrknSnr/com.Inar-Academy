package chapters;

public class FootballClub {
    private static double balance;
    private String name;
    private double ticketFee;
    private String stadium;
    private int capacity;


    public FootballClub() {
    }

    public FootballClub(double balance, String name, double ticketFee, String stadium, int capacity) {
        this.balance = balance;
        this.stadium = stadium;
        this.capacity = capacity;
        this.name = name;
        this.ticketFee = ticketFee;
    }


}
