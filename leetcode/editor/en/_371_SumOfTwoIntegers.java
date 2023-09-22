/**
 * Given two integers a and b, return the sum of the two integers without using the operators + and
 * -.
 *
 * <p>Example 1: Input: a = 1, b = 2 Output: 3
 *
 * <p>Example 2: Input: a = 2, b = 3 Output: 5
 *
 * <p>Constraints:
 *
 * <p>-1000 <= a, b <= 1000
 *
 * <p>Related Topics Math Bit Manipulation 👍 3828 👎 5196
 */
public class _371_SumOfTwoIntegers {
  public static void main(String[] args) {
    Solution solution = new _371_SumOfTwoIntegers().new Solution();
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int getSum(int a, int b) {
      if (a == 0) return b;
      if (b == 0) return a;

      int temp = 0;
      while (b != 0) {
        temp = a & b;
        a = a ^ b;
        b = temp << 1;
      }
      return a;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
