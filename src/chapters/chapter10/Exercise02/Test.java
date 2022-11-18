package chapters.chapter10.Exercise02;

public class Test {

    public static void main(String[] args) {

        BMI bmi = new BMI("FURKAN",25,83, 600,39);
        System.out.println(bmi.getName() + " : " + bmi.getBMI() +" and the status is : "+ bmi.getStatus());

        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        System.out.println("The BMI for " + bmi1.getName() + " is "
                + bmi1.getBMI() + " " + bmi1.getStatus());
    }
}
