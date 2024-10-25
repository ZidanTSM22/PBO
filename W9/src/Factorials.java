import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        // Loop to allow multiple calculations
        while (keepGoing.equalsIgnoreCase("y")) {
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();

            try {
                // Calculate and print the factorial
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                // Print the error message from the exception
                System.out.println("Error: " + e.getMessage());
            }

            // Ask if the user wants to calculate another factorial
            System.out.print("Another factorial? (y/n): ");
            keepGoing = scan.next();
        }
    }
}
