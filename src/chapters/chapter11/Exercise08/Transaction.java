package chapters.chapter11.Exercise08;

import java.util.Date;

public class Transaction {

    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;


    public Transaction(char ch, double amount, double balance, String description) {
        this.type = ch;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Date: " + date + "\nType : " + type + "\nAmount " + amount +
                "\nBalance " + balance + "\nDescription " + description + "\n---------------------------------\n";
    }

}
