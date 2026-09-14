public class ThrowDemo {
    public static int slicesPerPerson(int slices, int people)
    {
        System.out.println("Inside sclicesPerPerson");

        if(people <= 0) {
            throw new IllegalArgumentException("Number of people must be positive");
        }

        if(slices < 0) {
            throw new IllegalArgumentException("Number of slices must be positive");
        }
        return slices / people;
    }
    public static void showShare(int slices, int people) {
        System.out.println("Starting calculation");

        int share = slicesPerPerson(slices, people);
        

        System.out.println("Slices per person: " + share);
        System.out.println("Calculation finished");
    }

    public static void main(String[] args) {
        try {
            showShare(-6, 3);                                                                           // Inputs
            System.out.println("Return normally to main");
        } catch (IllegalArgumentException e){
            System.out.println("Cannot calculate: " + e.getMessage());
        } 
        System.out.println("Program continues");
    }
}