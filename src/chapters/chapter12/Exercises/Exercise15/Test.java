package chapters.chapter12.Exercises.Exercise15;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws Exception {

        File file = new File("Exercise12_15.txt");
        if (file.exists()){
            System.out.println("The file is already exist");
            System.exit(0);
        }
        ArrayList<Integer> list = new ArrayList<>(100);
        try(
                PrintWriter output = new PrintWriter(file)
                ){

        }
    }
}
