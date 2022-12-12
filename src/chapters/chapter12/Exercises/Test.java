package chapters.chapter12.Exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("sener.txt");

        try (
                PrintWriter output = new PrintWriter(file);
        ){
            for (int i = 0; i < 10 ; i++) {
                output.print((int)(Math.random()*10)+" ");
            }

    }
}
}
