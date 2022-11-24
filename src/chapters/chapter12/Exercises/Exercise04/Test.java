package chapters.chapter12.Exercises.Exercise04;

public class Test {
    public static void main(String[] args) {

        Loan loan = new Loan();
        try {
            loan.setLoanAmount(-1);
        }catch (IllegalArgumentException ex){
            System.out.println("Oops!");
        }
    }
}
