/**
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 *
 * <p>Example 1:
 *
 * <p>Input: nums = [-2,1,-3,4,-1,2,1,-5,4] Output: 6 Explanation: The subarray [4,-1,2,1] has the
 * largest sum 6.
 *
 * <p>Example 2:
 *
 * <p>Input: nums = [1] Output: 1 Explanation: The subarray [1] has the largest sum 1.
 *
 * <p>Example 3:
 *
 * <p>Input: nums = [5,4,-1,7,8] Output: 23 Explanation: The subarray [5,4,-1,7,8] has the largest
 * sum 23.
 *
 * <p>Constraints:
 *
 * <p>1 <= nums.length <= 10⁵ -10⁴ <= nums[i] <= 10⁴
 *
 * <p>Follow up: If you have figured out the O(n) solution, try coding another solution using the
 * divide and conquer approach, which is more subtle.
 *
 * <p>Related Topics Array Divide and Conquer Dynamic Programming 👍 30246 👎 1309
 */
public class _53_MaximumSubarray {
  public static void main(String[] args) {
    Solution solution = new _53_MaximumSubarray().new Solution();
  }
  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int maxSubArray(int[] nums) {
      if (nums.length == 1) {
        return nums[0];
      }
      int max = nums[0], temp = nums[0];
      for (int i = 1; i < nums.length; i++) {
        temp = Math.max(nums[i] + temp, nums[i]);
        if (temp > max) {
          max = temp;
        }
      }
      return max;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
