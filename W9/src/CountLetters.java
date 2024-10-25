import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        int[] counts = new int[26];  // Array to store frequency of each letter (A-Z)
        Scanner scan = new Scanner(System.in);

        // Get word from user
        System.out.print("Enter a word (letters only, please): ");
        String word = scan.nextLine();

        // Convert to all upper case
        word = word.toUpperCase();

        // Count frequency of each letter in the string
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++;  // Translate character to index (A = 0, B = 1, ..., Z = 25)
            } catch (ArrayIndexOutOfBoundsException e) {
                // Ignore non-letter characters
                System.out.println("Not a letter: " + word.charAt(i));
            }
        }

        // Print frequencies
        System.out.println("\nLetter Frequencies:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
