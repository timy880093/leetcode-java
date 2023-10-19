/**
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * <p>Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the
 * top?
 *
 * <p>Example 1:
 *
 * <p>Input: n = 2 Output: 2 Explanation: There are two ways to climb to the top. 1. 1 step + 1 step
 * 2. 2 steps
 *
 * <p>Example 2:
 *
 * <p>Input: n = 3 Output: 3 Explanation: There are three ways to climb to the top. 1. 1 step + 1
 * step + 1 step 2. 1 step + 2 steps 3. 2 steps + 1 step
 *
 * <p>Constraints:
 *
 * <p>1 <= n <= 45
 *
 * <p>Related Topics Math Dynamic Programming Memoization 👍 20200 👎 675
 */
public class _70_ClimbingStairs {
  public static void main(String[] args) {
    Solution solution = new _70_ClimbingStairs().new Solution();
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    public int climbStairs(int n) {
      if (n < 2) return n;
      int[] ints = new int[n];
      ints[0] = 1;
      ints[1] = 2;
      for (int i = 2; i < n; i++) {
        ints[i] = ints[i - 1] + ints[i - 2];
      }
      return ints[n - 1];
    }

    public int climbStairs2(int n) {
      if (n < 2) return n;
      int a = 1, b = 2, tmp = 0;
      for (int i = 3; i <= n; i++) {
        tmp = b;
        b += a;
        a = tmp;
      }
      return b;
    }

  }
  // leetcode submit region end(Prohibit modification and deletion)

}
