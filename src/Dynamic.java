import java.util.HashMap;
import java.util.Map;

// Складності до динамічного методу:
// Часова: O(n)
// Просторова: O(n)
public class Dynamic {
    public static class FibonacciDP {
        private static Map<Integer, Long> memo = new HashMap<>();

        public static long fibonacci(int n) {
            if (n <= 1) {
                return n;
            }

            if (memo.containsKey(n)) {
                return memo.get(n);
            }

            long fib = fibonacci(n - 1) + fibonacci(n - 2);
            memo.put(n, fib);
            return fib;
        }

        public static void main(String[] args) {
            int n = 6;
            long result = fibonacci(n);
            System.out.println("Fibonacci(" + n + ") = " + result);
        }
    }
}
