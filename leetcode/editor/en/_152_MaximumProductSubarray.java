/**
 * Given an integer array nums, find a subarray that has the largest product, and return the
 * product.
 *
 * <p>The test cases are generated so that the answer will fit in a 32-bit integer.
 *
 * <p>Example 1:
 *
 * <p>Input: nums = [2,3,-2,4] Output: 6 Explanation: [2,3] has the largest product 6.
 *
 * <p>Example 2:
 *
 * <p>Input: nums = [-2,0,-1] Output: 0 Explanation: The result cannot be 2, because [-2,-1] is not
 * a subarray.
 *
 * <p>Constraints:
 *
 * <p>1 <= nums.length <= 2 * 10⁴ -10 <= nums[i] <= 10 The product of any prefix or suffix of nums
 * is guaranteed to fit in a 32-bit integer.
 *
 * <p>Related Topics Array Dynamic Programming 👍 17110 👎 523
 */
public class _152_MaximumProductSubarray {
  public static void main(String[] args) {
    Solution solution = new _152_MaximumProductSubarray().new Solution();
  }
  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    // Time:O(N)、Space:O(1)
    public int maxProduct(int[] nums) {
      int max_so_far = nums[0];
      int min_so_far = nums[0];
      int result = max_so_far;

      for (int i = 1; i < nums.length; i++) {
        int temp_max = Math.max(Math.max(nums[i], max_so_far * nums[i]), min_so_far * nums[i]);
        min_so_far = Math.min(Math.min(nums[i], max_so_far * nums[i]), min_so_far * nums[i]);
        max_so_far = temp_max;

        result = Math.max(max_so_far, result);
      }
      return result;
    }

    // Time:O(N2)、Space:O(1)
    public int maxProduct2(int[] nums) {
      int result = nums[0];
      for (int i = 0; i < nums.length; i++) {
        int p = nums[i];
        for (int j = i + 1; j < nums.length; j++) {
          result = Math.max(result, p);
          p *= nums[j];
        }
        result = Math.max(result, p);
      }
      return result;
    }

    // Time:O(N2)、Space:O(1)
    // 左到右、右到左各跑一次
    public int maxProduct3(int[] nums) {
      int product = 1;
      int ans = Integer.MIN_VALUE;
      int n = nums.length;
      for (int i = 0; i < n; i++) {
        product *= nums[i];
        ans = Math.max(product, ans);
        if (nums[i] == 0) product = 1;
      }
      product = 1;

      for (int i = n - 1; i >= 0; i--) {
        product *= nums[i];
        ans = Math.max(product, ans);
        if (nums[i] == 0) product = 1;
      }
      return ans;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
