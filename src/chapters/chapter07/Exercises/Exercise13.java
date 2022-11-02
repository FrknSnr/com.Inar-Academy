package chapters.chapter07.Exercises;

public class Exercise13 {
    public static void main(String[] args) {

//main method ...

    }

    public static int getRandom(int... numbers) {
        int num;
        boolean isExcluded;
        do {
            isExcluded = false;
            num = 1 + (int) (Math.random() * 54);
            for (int i : numbers) {
                if (num == i)
                    isExcluded = true;
            }

        } while (isExcluded);
        return num;

    }


}
