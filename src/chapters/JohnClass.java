package chapters;

import java.io.File;
import java.io.PrintWriter;

public class JohnClass {
    public static void main(String[] args) throws Exception {
        File file = new File("ac.txt");
        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            output.print("John , Hamza, John, Fuko");
        }
    }
}
