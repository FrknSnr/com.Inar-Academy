package chapters.chapter08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        double[][] coo = getCoordinates();
        double[] distances = getDistances(coo);
        int minIndex = getMinDistance(distances);
        System.out.println("The central city is at " + Arrays.toString(coo[minIndex]));
        System.out.printf("The total distance to all other cities is %2.2f ", distances[minIndex]) ;
    }

    private static int getMinDistance(double[] distances) {
        double min = Double.MAX_VALUE ;
        int minIndex = -1 ;
        for (int i = 0; i < distances.length; i++) {
            if (min > distances[i]){
                min = distances[i];
                minIndex = i ;
            }
        }
        return minIndex;
    }

    private static double[] getDistances(double[][] coo) {
        double[] distance = new double[coo.length];
        for (int i = 0; i < coo.length; i++) {
            double sum = 0;
            for (int j = 0; j < coo.length; j++) {
                if (coo[i] != coo[j]) {
                    sum += Math.sqrt(Math.pow((coo[j][0] - coo[i][0]), 2) + Math.pow(coo[j][1] - coo[i][1], 2));
                }
            }
            distance[i] = sum;
        }
        return distance;
    }


    public static double[][] getCoordinates() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of cities : ");
        int number0fCities = input.nextInt();
        System.out.println("Enter the coordinates :");
        double[][] coo = new double[number0fCities][2];
        for (int i = 0; i < number0fCities; i++) {
            for (int j = 0; j < 2; j++) {
                coo[i][j] = input.nextDouble();
            }
        }
        return coo;
    }
}

