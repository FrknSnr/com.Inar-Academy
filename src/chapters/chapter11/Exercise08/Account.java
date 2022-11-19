package chapters.chapter11.Exercise08;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private ArrayList<Transaction> transactions;
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (getAnnualInterestRate() / 100) / 12;
    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        Transaction t = new Transaction('W', amount, balance, "For Help");
        setBalance(getBalance() - amount);
        transactions.add(t);
    }


    public void deposit(double amount) {
        Transaction t = new Transaction('D', amount, balance, "Scholarship");
        setBalance(getBalance() + amount);
        transactions.add(t);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < transactions.size(); i++) {
            sb.append(transactions.get(i));
        }
        return "name: " + name + "\nbalance: " + getBalance() +
                "\nmonthly interest: " + getMonthlyInterest() +
                "\ndate created: " + getDateCreated() +
                "\ntransactions: \n" + sb ;
    }
}
