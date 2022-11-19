package chapters.chapter11.Exercise03;

public class Test {
    public static void main(String[] args) {
        Account account = new Account(01, 150000, 7);
        SavingsAccount savingsAccount = new SavingsAccount(02, 175000, 12);
        CheckingAccount checkingAccount = new CheckingAccount(9, 120000, 3.4, 85000);

        System.out.println(account);
        System.out.println(savingsAccount);
        System.out.println(checkingAccount);
    }
}
