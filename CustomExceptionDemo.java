class InvalidStepCountException extends Exception {
    public InvalidStepCountException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static double stepsToMiles(int steps)
            throws InvalidStepCountException {

        if (steps < 0) {
            throw new InvalidStepCountException(
                "Step count cannot be negative."
            );
        }

        return steps / 2000.0;
    }

    public static void main(String[] args) {
        try {
            double miles = stepsToMiles(5000);
            System.out.println("Miles: " + miles);
        } catch (InvalidStepCountException e) {
            System.out.println(e.getMessage());
        }
    }
}