/**
 * Write a function that takes the binary representation of an unsigned integer and returns the
 * number of '1' bits it has (also known as the Hamming weight).
 *
 * <p>Note:
 *
 * <p>Note that in some languages, such as Java, there is no unsigned integer type. In this case,
 * the input will be given as a signed integer type. It should not affect your implementation, as
 * the integer's internal binary representation is the same, whether it is signed or unsigned. In
 * Java, the compiler represents the signed integers using 2's complement notation. Therefore, in
 * Example 3, the input represents the signed integer. -3.
 *
 * <p>Example 1:
 *
 * <p>Input: n = 00000000000000000000000000001011 Output: 3 Explanation: The input binary string
 * 00000000000000000000000000001011 has a total of three '1' bits.
 *
 * <p>Example 2:
 *
 * <p>Input: n = 00000000000000000000000010000000 Output: 1 Explanation: The input binary string
 * 00000000000000000000000010000000 has a total of one '1' bit.
 *
 * <p>Example 3:
 *
 * <p>Input: n = 11111111111111111111111111111101 Output: 31 Explanation: The input binary string
 * 11111111111111111111111111111101 has a total of thirty one '1' bits.
 *
 * <p>Constraints:
 *
 * <p>The input must be a binary string of length 32.
 *
 * <p>Follow up: If this function is called many times, how would you optimize it?
 *
 * <p>Related Topics Divide and Conquer Bit Manipulation 👍 5813 👎 1209
 */
public class _191_NumberOf1Bits {
  public static void main(String[] args) {
    Solution solution = new _191_NumberOf1Bits().new Solution();
    solution.hammingWeight(3);
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  public class Solution {
    // you need to treat n as an unsigned value

    public int hammingWeight(int n) {
      int ans = 0;
      while (n != 0) {
        ans += 1 & n;
        n >>>= 1;
      }
      return ans;
    }
    //    public int hammingWeight(int n) {
    //      int ans = 0;
    //      while (n > 0) {
    //        if (n % 2 != 0) ans += 1;
    //        n = n / 2;
    //      }
    //      return ans;
    //    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
