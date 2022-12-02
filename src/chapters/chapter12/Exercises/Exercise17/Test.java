package chapters.chapter12.Exercises.Exercise17;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws Exception {

        char guessAnotherWord ;
        ArrayList<String> words = new ArrayList<>();
        File sourceFile = new File("hangman.txt");
        try(
                Scanner fileWords = new Scanner(sourceFile)
                ){ while (fileWords.hasNext()){
                    words.add(fileWords.next());
        }
    }
        }
}
