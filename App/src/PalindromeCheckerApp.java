/**
 *
 * =========================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 3: Palindrome Check by Reversing String
 *
 * Description:
 * This class checks whether a given string is a palindrome
 * by reversing it using a loop and comparing the result.
 *
 * Key focus:
 * - for loop
 * - String immutability
 * - String concatenation
 * - equals() method
 *
 * @author Kabilesh C
 * @version 3.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String original = "level";
        String reversed = "";

        System.out.println("=================================");
        System.out.println("Palindrome Checker - UC3");
        System.out.println("=================================");
        System.out.println("Original String: " + original);
        System.out.println();

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
        System.out.println();

        // Compare content using equals()
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println();
        System.out.println("Program execution completed.");
    }
}