import java.util.Scanner;

public class Predict {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter an integer: ");
            String text = in.nextLine();

            try{
                System.out.println("A");
                int number = Integer.nextInt(text);
                System.out.println("B: " + number);
            } catch(NumberFormatException e) {
                System.out.println("C: invalid integer");
            } finally {
                System.out.println("D: finally");
            }
            System.out.println("E: after try/catch");
    }
}