package chapters.chapter06;

public class Exercise38 {
    public static void main(String[] args) {
        int times = 0;
        while (times < 10) {
            for (int i = 1; i <= 10; i++) {
                if (i % 10 == 0) {
                    System.out.println(getRandomUpperCaseLetter());
                } else
                    System.out.printf("%-4c", getRandomUpperCaseLetter());
            }
            times++;
        }
        int vez = 0 ;
        while (vez < 10) {
            for (int i = 1; i <= 10; i++) {
                if (i % 10 == 0) {
                    System.out.println(getRandomDigitCharacter());
                } else
                    System.out.printf("%-4c", getRandomDigitCharacter());
            }
            vez++;
        }
    }

    public static char getRandomCharacter(char ch1, char ch2) {

        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }
}

