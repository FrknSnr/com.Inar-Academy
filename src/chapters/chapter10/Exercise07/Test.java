package chapters.chapter10.Exercise07;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account[] accounts1 = new Account[10];
        for (int i = 0; i < accounts1.length; i++) {
            accounts1[i] = new Account(i, 100);
        }

        while (true) {
            System.out.println("Enter an id :");
            int id = input.nextInt();
            while (!isValid(id)) {
                System.out.println("You entered an invalid id. Please enter a valid id number :");
                id = input.nextInt();
            }
            int choice ;
            do {
                displayMainMenu();
                System.out.println("Enter a choice :");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        displayBalance(accounts1[id]);
                        break;
                    case 2:
                        withDrawMoney(accounts1[id], input);
                        break;
                    case 3:
                        depositMoney(accounts1[id], input);
                        break;
                    case 4 : break;
                }
            } while (choice != 4);

        }
    }

    public static void displayMainMenu() {
        System.out.println("Main Menu\n" +
                "1: check balance\n" +
                "2: withdraw\n" +
                "3: deposit\n" +
                "4: exit");
    }

    public static void depositMoney(Account id, Scanner input) {
        System.out.println("Enter an amount to deposit : ");
        id.setBalance(id.getBalance() + input.nextDouble());
        System.out.println();
    }

    public static void withDrawMoney(Account id, Scanner input) {
        System.out.println("Enter an amount to withdraw : ");
        id.setBalance(id.getBalance() - input.nextDouble());
        System.out.println();
    }

    public static void displayBalance(Account id) {
        System.out.println("The balance is : " + id.getBalance());
        System.out.println();
    }

    public static boolean isValid(int id) {
        return id >= 0 && id <= 9;
    }
}