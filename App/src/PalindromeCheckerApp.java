/**
 *
 * =========================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 10: Palindrome Validation Ignoring Spaces and Case
 *
 * Description:
 * This program checks whether a string is a palindrome
 * after normalizing it by:
 * - Removing spaces and special characters
 * - Converting all characters to lowercase
 *
 * Key Concepts:
 * - String preprocessing
 * - Regular expressions
 * - Case normalization
 *
 * Data Structure Used:
 * - String / Character Array
 *
 * @author Kabilesh C
 * @version 10.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        System.out.println("=================================");
        System.out.println("Palindrome Checker - UC10");
        System.out.println("=================================");
        System.out.println("Original Input: " + input);
        System.out.println();

        // Step 1: Normalize string
        String normalized = normalizeString(input);

        System.out.println("Normalized Input: " + normalized);
        System.out.println();

        // Step 2: Apply palindrome logic (two-pointer approach)
        boolean isPalindrome = checkPalindrome(normalized);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println();
        System.out.println("Program execution completed.");
    }

    /**
     * Removes non-alphanumeric characters and converts to lowercase
     */
    public static String normalizeString(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    /**
     * Two-pointer palindrome check
     */
    public static boolean checkPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}