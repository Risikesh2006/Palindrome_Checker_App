/**
 * =========================================================
 * CLASS - PalindromeChecker
 * =========================================================
 *
 * Encapsulates palindrome validation logic.
 *
 * OOPS Concepts:
 * - Encapsulation
 * - Single Responsibility Principle
 *
 * Internal Data Structure:
 * - Character Array (Two-pointer approach)
 *
 * @version 11.0
 */

public class PalindromeChecker {

    /**
     * Public method accessible to other classes.
     * Hides internal implementation details.
     */
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        String normalized = normalize(input);
        return isPalindrome(normalized);
    }

    // Private method: handles preprocessing
    private String normalize(String input) {
        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // Private method: core palindrome logic
    private boolean isPalindrome(String str) {

        char[] chars = str.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}