package chapters.chapter05.Exercises;

public class Exercise39 {

    public static void main(String[] args) {

        int salary = 5000;
        double commission = 0;
        double sales = 10001;
        do {
            commission = 0;
            commission += 5000 * (8.0 / 100);
            commission += 5000 * (10.0 / 100);
            commission += (sales - 10000) * (12.0 / 100);
            sales += 0.1;
        } while (salary + commission <= 30000);

        System.out.println("You must sale : " + sales);



    }
}
