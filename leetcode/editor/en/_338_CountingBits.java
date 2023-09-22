/**
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
 * ans[i] is the number of 1's in the binary representation of i.
 *
 * <p>Example 1:
 *
 * <p>Input: n = 2 Output: [0,1,1] Explanation: 0 --> 0 1 --> 1 2 --> 10
 *
 * <p>Example 2:
 *
 * <p>Input: n = 5 Output: [0,1,1,2,1,2] Explanation: 0 --> 0 1 --> 1 2 --> 10 3 --> 11 4 --> 100 5
 * --> 101
 *
 * <p>Constraints:
 *
 * <p>0 <= n <= 10⁵
 *
 * <p>Follow up:
 *
 * <p>It is very easy to come up with a solution with a runtime of O(n log n). Can you do it in
 * linear time O(n) and possibly in a single pass? Can you do it without using any built-in function
 * (i.e., like __builtin_ popcount in C++)?
 *
 * <p>Related Topics Dynamic Programming Bit Manipulation 👍 10481 👎 474
 */
public class _338_CountingBits {
  public static void main(String[] args) {
    Solution solution = new _338_CountingBits().new Solution();
    for (int i : solution.countBits(5)) {
      System.out.println(i);
    }
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
//[0,1,1,2,1,2,2,3,1]
    // Time Limit Exceeded
    public int[] countBits(int n) {
      int[] ans = new int[n + 1];
      for (int i = 0; i <= n; i++) {
        int count = 0;
        int temp = i;
        while (temp != 0) {
          count += 1 & temp;
          temp >>>= 1;
        }
        ans[i] = count;
      }
      return ans;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
