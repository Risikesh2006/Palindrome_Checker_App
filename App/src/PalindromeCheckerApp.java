/**
 *
 * =========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6: Demonstrate FIFO vs LIFO using Queue and Stack
 *
 * Description:
 * This class demonstrates the behavioral difference between
 * Queue (FIFO) and Stack (LIFO) while validating palindrome logic.
 *
 * Key focus:
 * - Queue (FIFO)
 * - Stack (LIFO)
 * - Enqueue & Dequeue
 * - Push & Pop
 * - Logical comparison of outputs
 *
 * @author Kabilesh C
 * @version 6.0
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        System.out.println("=================================");
        System.out.println("Palindrome Checker - UC6");
        System.out.println("=================================");
        System.out.println("Input String: " + input);
        System.out.println();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);     // Enqueue
            stack.push(ch);    // Push
        }

        boolean isPalindrome = true;

        // Compare Dequeue vs Pop
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue (FIFO)
            char fromStack = stack.pop();     // Pop (LIFO)

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Display Result
        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println();
        System.out.println("Program execution completed.");
    }
}