/**
 *
 * =========================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 8: Palindrome Validation Using Singly Linked List
 *
 * Description:
 * This program converts a string into a singly linked list,
 * finds the middle using fast and slow pointers,
 * reverses the second half in-place,
 * and compares both halves to check palindrome.
 *
 * Key Concepts:
 * - Singly Linked List
 * - Node traversal
 * - Fast & Slow pointer technique
 * - In-place reversal
 *
 * @author Kabilesh C
 * @version 8.0
 */

public class PalindromeCheckerApp {

    // Node structure
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        String input = "level";

        System.out.println("=================================");
        System.out.println("Palindrome Checker - UC8");
        System.out.println("=================================");
        System.out.println("Input String: " + input);
        System.out.println();

        // Convert string to linked list
        Node head = null, tail = null;

        for (int i = 0; i < input.length(); i++) {
            Node newNode = new Node(input.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        boolean isPalindrome = checkPalindrome(head);

        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }

        System.out.println();
        System.out.println("Program execution completed.");
    }

    // Palindrome check using linked list
    public static boolean checkPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle using fast and slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow);
        Node firstHalf = head;

        // Compare both halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // In-place reversal of linked list
    public static Node reverse(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }
}