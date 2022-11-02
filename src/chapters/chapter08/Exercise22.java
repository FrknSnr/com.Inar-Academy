package chapters.chapter08;

public class Exercise22 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }
        }display(arr);
        checkRows(arr);
        checkCols(arr);
    }public static void display(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%-2d", arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void checkCols(int[][] matrix) {
        for (int col = 0; col < matrix[0].length; col++) {
            int count = 0;
            for (int[] row : matrix) {
                if (row[col] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                System.out.println("The " + col + ". column has even number of 1s.");
            }
        }
    }

    public static void checkRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                System.out.println("The " + i + ". row has even number of 1s.");
            }
        }
    }
}
