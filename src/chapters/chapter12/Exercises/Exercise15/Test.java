package chapters.chapter12.Exercises.Exercise15;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {

        File file = new File("Exercise12_15.txt");
        if (file.exists()) {
            System.out.println("The file is already exist");
            System.exit(0);
        }

        printFile(file);
        ArrayList<Integer> list = sortList(file);
        display(list);

    }

    public static void display(ArrayList<Integer> list) {
        for (Integer e : list) {
            System.out.print(e + " ");
        }
    }


    public static ArrayList<Integer> sortList(File file) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        try (
                Scanner input = new Scanner(file)
        ) {
            while (input.hasNext()) {
                list.add(input.nextInt());
            }
        }
        java.util.Collections.sort(list);
        return list;
    }


    public static void printFile(File file) throws Exception {
        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            for (int i = 0; i < 100; i++) {
                output.print((int)(Math.random() * 100) + " ");
            }
        }
    }
}
