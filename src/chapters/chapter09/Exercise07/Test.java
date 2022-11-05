package chapters.chapter09.Exercise07;

public class Test {

    public static void main(String[] args) {

        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2.500);
        account.deposit(3000);
        System.out.println("The account with "+ account.getId()+" id:\n\n" +"The current balance : " + account.getBalance() + "\nThe monthly interest : " + account.getMonthlyInterest()
                + "\nThe date when this account was created : " + account.getDateCreated());
    }
}
