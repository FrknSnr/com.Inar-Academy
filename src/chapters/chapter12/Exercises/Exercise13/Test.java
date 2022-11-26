package chapters.chapter12.Exercises.Exercise13;

import java.io.File;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.out.println("Usage : java Exercise12_13 fileName");
            System.exit(0);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("There isn't any file like" + args[0]);
            System.exit(1);
        }
        String s = "";
        int countWords = 0;
        int countChars = 0;
        int countLines = 0;
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                s = input.nextLine();
                countLines++;
                countChars += countNumberOfCharacters(s);
                countWords += countNumberOfWords(s);
            }
        }
        System.out.println("Number of words : " + countWords + "\nNumber of lines : " + countLines + "\nNumber of characters : " + countChars);
    }

    public static int countNumberOfCharacters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) == ' ' && s.charAt(i) == '\n')) {
                count++;
            }
        }
        return count;
    }

    public static int countNumberOfWords(String s) {
        String[] arr = s.split(" ");
        return arr.length;
    }
}
