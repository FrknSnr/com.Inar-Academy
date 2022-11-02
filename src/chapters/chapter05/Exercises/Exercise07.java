package chapters.chapter05.Exercises;

public class Exercise07 {

    public static void main(String[] args) {

        double tuition = 10_000;
        for (int i = 0; i < 10; i++) {
            tuition += tuition * 0.05;

        }
        System.out.println("The tuition after 10 years is : " + tuition);
        double costOfFourYearsAfterTenthYear = 0;

        for (int c = 0; c < 4; c++) {
            tuition += tuition * 0.05;
            costOfFourYearsAfterTenthYear += tuition;

        }
        System.out.println("The total cost of four years’ worth of tuition after the tenth year is : " +
                costOfFourYearsAfterTenthYear);
    }

}
