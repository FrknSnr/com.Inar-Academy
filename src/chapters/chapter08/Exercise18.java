package chapters.chapter08;

import java.util.Arrays;

public class Exercise18 {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(m);
        display(m);
    }

    public static void shuffle(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                int i1 = (int) (Math.random() * m.length);
                int j1 = (int) (Math.random() * m[i].length);
                int temp = m[i][j];
                m[i][j] = m[i1][j1];
                m[i1][j1] = temp;
            }
        }

    }public static void display(int[][] m ){
        for (int i = 0; i < m.length; i++) {
            System.out.println(Arrays.toString(m[i]));
        }
    }

}
