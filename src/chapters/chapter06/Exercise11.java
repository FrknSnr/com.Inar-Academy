package chapters.chapter06;

public class Exercise11 {

    public static void main(String[] args) {
        System.out.printf("%-20s%s\n", "Sales Amount", "Commission");
        System.out.println("''''''''''''''''''''''''''''''''''''''''''''''");
        for (double salesAmount = 10000; salesAmount <= 100_000; salesAmount += 5000) {
            System.out.printf("%-20s%s\n", salesAmount, computeCommission(salesAmount));
        }
    }
    public static double computeCommission(double salesAmount) {
        double commission = 0;
        if (salesAmount == 10000) {
            commission = (5000 * 8.0 / 100) + ((salesAmount - 5000) * 10.0 / 100);
        } else
            commission = (5000 * 8.0 / 100) + (5000 * 10.0 / 100) + ((salesAmount - 10000) * 12.0 / 100);

        return commission;
    }
}


