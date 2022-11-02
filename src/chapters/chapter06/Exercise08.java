package chapters.chapter06;

public class Exercise08 {
    public static void main(String[] args) {

        System.out.printf("%-15s%-18s%-10s%-14s%-15s\n", "Celsius", "Fahrenheit", "|", "Fahrenheit", "Celsius");
        System.out.println("_________________________________________________________________________");

        for (double celsius = 40.0 , fahrenheit = 120.0 ; celsius >= 31.0 && fahrenheit >= 30.0 ; celsius-- , fahrenheit=fahrenheit-10) {
            System.out.printf("%-15.1f%-18.2f%-10s%-14s%-15.2f\n", celsius, celsiusToFahrenheit(celsius),"|",fahrenheit,fahrenheitToCelsius(fahrenheit));
        }
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit ;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius ;
    }


}
