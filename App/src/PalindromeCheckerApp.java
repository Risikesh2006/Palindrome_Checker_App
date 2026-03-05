import java.util.Arrays;
import java.util.List;

/**
 * =========================================================
 * MAIN CLASS - UseCase13PerformanceBenchmark
 * =========================================================
 *
 * Compares execution time of different palindrome strategies.
 *
 * Key Concepts:
 * - System.nanoTime()
 * - Algorithm performance comparison
 *
 * @version 13.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        System.out.println("=================================");
        System.out.println("Palindrome Performance Benchmark - UC13");
        System.out.println("=================================");
        System.out.println("Input: " + input);
        System.out.println();

        List<PalindromeStrategy> strategies = Arrays.asList(
                new TwoPointerStrategy(),
                new StackStrategy(),
                new DequeStrategy()
        );

        for (PalindromeStrategy strategy : strategies) {

            PalindromeChecker checker = new PalindromeChecker(strategy);

            long startTime = System.nanoTime();

            boolean result = checker.check(input);

            long endTime = System.nanoTime();

            long duration = endTime - startTime;

            System.out.println(strategy.getClass().getSimpleName());
            System.out.println("Result: " + result);
            System.out.println("Execution Time (ns): " + duration);
            System.out.println("---------------------------------");
        }
    }
}