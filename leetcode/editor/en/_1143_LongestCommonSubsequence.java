import static sun.swing.MenuItemLayoutHelper.max;

/**
 * Given two strings text1 and text2, return the length of their longest common subsequence. If
 * there is no common subsequence, return 0.
 *
 * <p>A subsequence of a string is a new string generated from the original string with some
 * characters (can be none) deleted without changing the relative order of the remaining characters.
 *
 * <p>For example, "ace" is a subsequence of "abcde".
 *
 * <p>A common subsequence of two strings is a subsequence that is common to both strings.
 *
 * <p>Example 1:
 *
 * <p>Input: text1 = "abcde", text2 = "ace" Output: 3 Explanation: The longest common subsequence is
 * "ace" and its length is 3.
 *
 * <p>Example 2:
 *
 * <p>Input: text1 = "abc", text2 = "abc" Output: 3 Explanation: The longest common subsequence is
 * "abc" and its length is 3.
 *
 * <p>Example 3:
 *
 * <p>Input: text1 = "abc", text2 = "def" Output: 0 Explanation: There is no such common
 * subsequence, so the result is 0.
 *
 * <p>Constraints:
 *
 * <p>1 <= text1.length, text2.length <= 1000 text1 and text2 consist of only lowercase English
 * characters.
 *
 * <p>Related Topics String Dynamic Programming 👍 12361 👎 156
 */
public class _1143_LongestCommonSubsequence {
  public static void main(String[] args) {
    Solution solution = new _1143_LongestCommonSubsequence().new Solution();
    int i = solution.longestCommonSubsequence("abcde", "ace");
    System.out.println(i);
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
      int len1 = text1.length();
      int len2 = text2.length();
      int[][] ints = new int[len1][len2];
      for (int i = 0; i < len1; i++) {
        for (int j = 0; j < len2; j++) {
          if (text1.charAt(i) == text2.charAt(j)) {
            ints[i][j] = (i > 0 && j > 0 ? ints[i - 1][j - 1] : 0) + 1;
          } else {
            ints[i][j] = Math.max(i > 0 ? ints[i - 1][j] : 0, j > 0 ? ints[i][j - 1] : 0);
          }
        }
      }
      return ints[len1 - 1][len2 - 1];
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
