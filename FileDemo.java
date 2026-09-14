import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        try (Scanner file = new Scanner(new File("steps.txt"))) {
            int lineNumber = 0;

            while (file.hasNextLine()) {
                String text = file.nextLine();
                lineNumber++;

                try {
                    int steps = Integer.parseInt(text);
                    System.out.println(
                        "Line " + lineNumber + ": " + steps + " steps"
                    );
                } catch (NumberFormatException e) {
                    System.out.println(
                        "Skipping invalid number on line " + lineNumber
                    );
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could not open steps.txt");
        }

        System.out.println("Finished");
    }
}