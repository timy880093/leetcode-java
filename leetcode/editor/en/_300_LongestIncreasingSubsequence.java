import java.util.Arrays;

/**
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 *
 * <p>Example 1:
 *
 * <p>Input: nums = [10,9,2,5,3,7,101,18] Output: 4 Explanation: The longest increasing subsequence
 * is [2,3,7,101], therefore the length is 4.
 *
 * <p>Example 2:
 *
 * <p>Input: nums = [0,1,0,3,2,3] Output: 4
 *
 * <p>Example 3:
 *
 * <p>Input: nums = [7,7,7,7,7,7,7] Output: 1
 *
 * <p>Constraints:
 *
 * <p>1 <= nums.length <= 2500 -10⁴ <= nums[i] <= 10⁴
 *
 * <p>Follow up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?
 *
 * <p>Related Topics Array Binary Search Dynamic Programming 👍 19059 👎 360
 */
public class _300_LongestIncreasingSubsequence {
  public static void main(String[] args) {
    Solution solution = new _300_LongestIncreasingSubsequence().new Solution();
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int lengthOfLIS(int[] nums) {
      int n = nums.length, max = 0;
      int[] dp = new int[n];
      Arrays.fill(dp, 1);

      // 雙迴圈，內圈為左數，外圈為右數
      for (int i = 1; i < n; i++) {
        for (int j = 0; j < i; j++) {
          // 右數 > 左數 & dp[右] < dp[左]+1
          if (nums[i] > nums[j] && dp[i] < dp[j] + 1) dp[i] = dp[j] + 1;
        }
      }
      for (int i = 0; i < n; i++) {
        if (max < dp[i]) max = dp[i];
      }
      return max;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
