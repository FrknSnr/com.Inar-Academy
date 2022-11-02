package chapters.chapter07.Exercises;

public class Exercise07 {
    public static void main(String[] args) {
        int[] counts = new int[10];
        int number;
        for (int i = 0; i < 100; i++) {
            number = (int) (Math.random() * 10);
            counts[number]++;
        }
        display(counts);
    }
    public static void display(int[] counts) {
        for (int index = 0; index < counts.length; index++) {
            System.out.println(index + (counts[index] > 1 ? "s" : "") + " : " + counts[index]);
        }
    }
}