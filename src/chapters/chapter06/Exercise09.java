package chapters.chapter06;

public class Exercise09 {
    public static void main(String[] args) {

        System.out.printf("%-15s%-15s%-10s%-15s%s\n", "Feet", "Meters", "|", "Meters", "Feet");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (double feet = 1.0, meters = 20.0; feet <= 10.0 && meters <= 65.0; feet++, meters += 5) {
            System.out.printf("%-15.1f%-15.3f%-10s%-15.1f%.3f\n", feet, footToMeter(feet), "|", meters, meterToFoot(meters));
        }
    }
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter) {
        return 3.279 * meter ;
    }
}
