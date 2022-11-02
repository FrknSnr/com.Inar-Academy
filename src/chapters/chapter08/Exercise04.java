package chapters.chapter08;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of employees : ");
        int numberOfEmployees = input.nextInt();
        int[][] hours = new int[numberOfEmployees][7];
        System.out.println("Enter the work hours day-by-day for each employees : ");
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                hours[i][j] = input.nextInt();
            }
        }
        sum(hours, numberOfEmployees);
    }

    public static void sum(int[][] hours, int numberOfEmployees) {
        int[] employee = new int[numberOfEmployees];
        for (int row = 0; row < hours.length; row++) {
            int sum = 0;
            for (int col = 0; col < hours[row].length; col++) {
                sum += hours[row][col];
            }
            employee[row] = sum;
        }
        sort(employee,numberOfEmployees);
    }

    public static void sort(int[] employees,int numberOfEmployees) {
        for (int i = 0; i < employees.length - 1; i++) {
            int max = employees[i];
            int maxIndex = i;
            for (int j = i + 1; j < employees.length; j++) {
                if (max < employees[j]) {
                    max = employees[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                employees[maxIndex] = employees[i];
                employees[i] = max;
            }
        }for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Employee " + i + " : " + employees[i]);
        }
    }
}
