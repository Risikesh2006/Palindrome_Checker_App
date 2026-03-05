/**
 *
 * =========================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 7: Palindrome Validation Using Deque
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Deque (Double Ended Queue).
 *
 * The deque allows insertion and removal from both
 * front and rear ends, enabling direct comparison
 * of first and last characters.
 *
 * Key focus:
 * - Deque
 * - addLast()
 * - removeFirst()
 * - removeLast()
 * - Front and rear comparison
 *
 * @author Kabilesh C
 * @version 7.0
 */

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        System.out.println("=================================");
        System.out.println("Palindrome Checker - UC7");
        System.out.println("=================================");
        System.out.println("Input String: " + input);
        System.out.println();

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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