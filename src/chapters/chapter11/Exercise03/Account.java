package chapters.chapter11.Exercise03;

import java.util.Date;

public class Account {

    private int accountNo;
    private double balance;
    private double annualIntRate;
    private Date date;

    public Account(int accountNo, double balance, double annualIntRate) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.annualIntRate = annualIntRate;
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withDraw(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setAnnualIntRate(double annualIntRate) {
        this.annualIntRate = annualIntRate;
    }

    public double getMonthlyIntRate() {
        return getAnnualIntRate() / 12;
    }

    private double getAnnualIntRate() {
        return annualIntRate;
    }

    public String toString() {
        return "ClassName = Account\nBalance = " + getBalance() + "\nMonthly interest = " + getMonthlyIntRate() +
                "\nDate created = " + getDate();
    }

}

class SavingsAccount extends Account {

    public SavingsAccount(int accountNo, double balance, double annualIntRate) {
        super(accountNo, balance, annualIntRate);

    }


    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("You don't have $" + amount + " in your account.");
        }
    }

    @Override
    public String toString() {
        return "ClassName = SavingsAccount\nBalance = " + getBalance() +
                "\nMonthly interest = " + getMonthlyIntRate() +
                "\nDate created = " + getDate();
    }
}

class CheckingAccount extends Account {

    private double overDraftLimit;

    public CheckingAccount() {
        super(0,0,0);
        overDraftLimit = 100;
    }

    public CheckingAccount(int accountNo, double balance, double annualIntRate, double overDraftLimit) {
        super(accountNo, balance, annualIntRate);
        this.overDraftLimit = overDraftLimit;
    }
    public void withdraw(double amount){
        if (getBalance() - amount >= 0 - overDraftLimit){
            setBalance(getBalance() - amount);
        }else {
            System.out.println("Out of limits!");
        }
    }
    @Override
    public String toString(){
        return  "ClassName = CheckingAccount\nBalance = " + getBalance() +
                "\nMonthly interest = " + getMonthlyIntRate() +
                "\nDate created = " + getDate();
    }
}
