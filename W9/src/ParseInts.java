import java.util.Scanner;

public class ParseInts {

    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        // Get a line of text from the user
        System.out.println("Enter a line of text:");
        String line = scan.nextLine();

        // Create a scanner to process the line token by token
        Scanner scanLine = new Scanner(line);

        // Loop through each token in the input line
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());  // Parse token as an integer
                sum += val;  // Add the integer to the sum
            } catch (NumberFormatException e) {
                // Ignore non-integer tokens
                System.out.println("Not an integer");
            }
        }

        // Print the final sum
        System.out.println("The sum of the integers on this line is: " + sum);
    }
}
