package chapters.chapter06;

public class Exercise15 {

    public static void main(String[] args) {
        System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Taxable", "Single", "Married Joint", "Married","Head of");
        System.out.printf("%-20s%33s%15s\n", "Income", "or Qualifying", "Separate");
        System.out.printf("%49s\n", "Widow(er)");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (int i = 50000; i <= 60000; i += 50) {
            System.out.printf("%d", i );
            for (int j = 1; j <= 4; j++) {
                System.out.printf("%20d",Math.round(cumpuTax(j, i)));
            }
            System.out.println();
        }
    }

    public static double cumpuTax(int status, double taxableIncome) {
        if (status == 1) {
            return 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
        }
        if (status == 2) {
            return 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
        }
        if (status == 3) {
            return 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;
        }
        if (status == 4) {
            return 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;
        } else
            System.out.println("Invalid value .");
        return 0.0;
    }
}
