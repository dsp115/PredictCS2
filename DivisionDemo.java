import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            System.out.print("Enter two integers on one line: ");

            if (!input.hasNextLine()) {
                break;
            }

            try {
                int numerator = input.nextInt();
                int denominator = input.nextInt();

                int result = numerator / denominator;
                System.out.println("Result: " + result);
                done = true;

            } catch (InputMismatchException e) {
                System.out.println("Both values must be integers.");

                // Discard the rest of this attempt, including bad input.
                if (input.hasNextLine()) {
                    input.nextLine();
                }

            } catch (ArithmeticException e) {
                System.out.println("The divisor cannot be zero.");

                if (input.hasNextLine()) {
                    input.nextLine();
                }
            }
        }
    }
}