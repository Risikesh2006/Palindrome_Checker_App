/**
 * =========================================================
 * CLASS - PalindromeChecker
 * =========================================================
 *
 * Context class for Strategy Pattern.
 *
 * Allows runtime selection of palindrome algorithm.
 *
 * @version 12.0
 */

public class PalindromeChecker {

    private PalindromeStrategy strategy;

    // Inject strategy through constructor
    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String input) {
        return strategy.checkPalindrome(input);
    }

    // Allow changing strategy dynamically
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }
}