package chapters.chapter12.Exercises.Exercise11;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.out.println("Usage: java Exercise12_11 StringThatWillRemoved fileName");
            System.exit(1);
        }

        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("al fuko");
            System.exit(1);
        }
        String s = "";
        String newS = "";
        try (
                Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                s = input.nextLine();
                newS = s.replaceAll(args[1], "");
            }
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            output.print(newS);
        }
    }
}
