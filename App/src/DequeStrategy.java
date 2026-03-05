import java.util.Deque;
import java.util.LinkedList;

public class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Deque<Character> deque = new LinkedList<>();

        for (char ch : normalized.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}