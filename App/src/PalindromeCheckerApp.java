/**
 *
 * =========================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 9: Palindrome Validation Using Recursion
 *
 * Description:
 * This program checks whether a string is a palindrome
 * using recursion.
 *
 * It compares the first and last characters,
 * then recursively checks the remaining substring.
 *
 * Key Concepts:
 * - Recursion
 * - Base condition
 * - Call stack
 *
 * Data Structure Used:
 * - Call Stack
 *
 * @author Kabilesh C
 * @version 9.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";

        System.out.println("=================================");
        System.out.println("Palindrome Checker - UC9");
        System.out.println("=================================");
        System.out.println("Input String: " + input);
        System.out.println();

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println();
        System.out.println("Program execution completed.");
    }

    /**
     * Recursive palindrome check
     *
     * @param str   Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, false otherwise
     */
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base condition: crossed pointers
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return checkPalindrome(str, start + 1, end - 1);
    }
}