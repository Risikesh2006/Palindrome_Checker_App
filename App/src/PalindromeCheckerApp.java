/**
 *
 * =========================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 4: Palindrome Check using Character Array
 * and Two-Pointer Technique
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by converting it into a character array and
 * comparing characters using the two-pointer approach.
 *
 * Key focus:
 * - char[] (Character Array)
 * - Array indexing
 * - Two-pointer technique
 * - Time efficiency awareness
 *
 * @author Kabilesh C
 * @version 4.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "radar";

        System.out.println("=================================");
        System.out.println("Palindrome Checker - UC4");
        System.out.println("=================================");
        System.out.println("Input String: " + input);
        System.out.println();

        // Convert String to char array
        char[] characters = input.toCharArray();

        // Two-pointer initialization
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Compare characters using two-pointer technique
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println();
        System.out.println("Program execution completed.");
    }
}