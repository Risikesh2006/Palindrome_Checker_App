public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        System.out.println("=================================");
        System.out.println("Palindrome Checker - UC12");
        System.out.println("=================================");
        System.out.println("Input: " + input);
        System.out.println();

        // Choose strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.check(input);

        if (result) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}