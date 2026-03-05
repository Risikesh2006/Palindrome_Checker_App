/**
 *
 * =========================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class checks whether a hardcoded string
 * is a palindrome and displays the result.
 *
 * No user input is taken in this stage.
 *
 * @author Kabilesh C
 * @version 2.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string literal
        String word = "madam";

        System.out.println("=================================");
        System.out.println("Palindrome Checker - UC2");
        System.out.println("=================================");
        System.out.println("Word to check: " + word);
        System.out.println();

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Palindrome condition check
        if (word.equals(reversed)) {
            System.out.println("Result: The word is a Palindrome.");
        } else {
            System.out.println("Result: The word is NOT a Palindrome.");
        }

        System.out.println();
        System.out.println("Program execution completed.");
    }
}