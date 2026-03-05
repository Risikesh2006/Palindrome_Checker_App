/**
 *
 * =========================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 5: Stack-Based Palindrome Validation
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Stack data structure.
 *
 * The stack follows LIFO (Last In First Out),
 * which naturally reverses the string.
 *
 * Key focus:
 * - Stack
 * - Push operation
 * - Pop operation
 * - Reversal logic using LIFO
 *
 * @author Kabilesh C
 * @version 5.0
 */

import java.util.Stack;

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "level";

        System.out.println("=================================");
        System.out.println("Palindrome Checker - UC5");
        System.out.println("=================================");
        System.out.println("Input String: " + input);
        System.out.println();

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < input.length(); i++) {

            char poppedChar = stack.pop();

            if (input.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
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