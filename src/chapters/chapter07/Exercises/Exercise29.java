package chapters.chapter07.Exercises;

public class Exercise29 {
    public static void main(String[] args) {
        int NUM_OF_PICKS = 4;
        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int sum = 0;
        int picks = 0;
        do {
            for (int i = 0; i < NUM_OF_PICKS; i++) {
                sum += cards[(int)(Math.random() * 52 )];
                picks++;

            }
        } while (sum != 24);
        System.out.println("The number of picks is : " + picks );
    }
}
