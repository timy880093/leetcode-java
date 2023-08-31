/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such
 * that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * <p>F(0) = 0, F(1) = 1 F(n) = F(n - 1) + F(n - 2), for n > 1.
 *
 * <p>Given n, calculate F(n).
 *
 * <p>Example 1:
 *
 * <p>Input: n = 2 Output: 1 Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 *
 * <p>Example 2:
 *
 * <p>Input: n = 3 Output: 2 Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 *
 * <p>Example 3:
 *
 * <p>Input: n = 4 Output: 3 Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 *
 * <p>Constraints:
 *
 * <p>0 <= n <= 30
 *
 * <p>Related Topics Math Dynamic Programming Recursion Memoization 👍 7414 👎 326
 */
public class _509_FibonacciNumber {
  public static void main(String[] args) {
    Solution solution = new _509_FibonacciNumber().new Solution();
    System.out.println(solution.fib(0));
  }
  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    // time:O(n)、space:O(1)
    public int fib(int n) {
      if (n < 2) return n;
      int[] arr = new int[n + 1];
      for (int i = 0; i <= n; i++) {
        arr[i] = (i == 0 || i == 1) ? i : arr[i - 1] + arr[i - 2];
      }
      return arr[n - 1] + arr[n - 2];
    }

    // time:O(2^n) 因為有 n 層，所以是 2 的 n 次方、space:O(1)
    //
    //    public int fib(int n) {
    //      return calculate(n);
    //    }
    //
    //    int calculate(int n) {
    //      if (n == 0 || n == 1) return n;
    //      return calculate(n - 1) + calculate(n - 2);
    //    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
