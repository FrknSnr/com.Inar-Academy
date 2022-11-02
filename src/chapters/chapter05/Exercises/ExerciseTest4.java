package chapters.chapter05.Exercises;

public class ExerciseTest4 {

    public static void main(String[] args) {
        int result = max(5,7);
        System.out.println(result);
    }

    public static int max(int a, int b) {
        if (a < b)
            return b;
        else
            return a;

    }
}
