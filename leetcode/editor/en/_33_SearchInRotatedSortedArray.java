/**
 * There is an integer array nums sorted in ascending order (with distinct values).
 *
 * <p>Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k
 * (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1],
 * nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at
 * pivot index 3 and become [4,5,6,7,0,1 ,2].
 *
 * <p>Given the array nums after the possible rotation and an integer target, return the index of
 * target if it is in nums, or -1 if it is not in nums.
 *
 * <p>You must write an algorithm with O(log n) runtime complexity.
 *
 * <p>Example 1: Input: nums = [4,5,6,7,0,1,2], target = 0 Output: 4
 *
 * <p>Example 2: Input: nums = [4,5,6,7,0,1,2], target = 3 Output: -1
 *
 * <p>Example 3: Input: nums = [1], target = 0 Output: -1
 *
 * <p>Constraints:
 *
 * <p>1 <= nums.length <= 5000 -10⁴ <= nums[i] <= 10⁴ All values of nums are unique. nums is an
 * ascending array that is possibly rotated. -10⁴ <= target <= 10⁴
 *
 * <p>Related Topics Array Binary Search 👍 24107 👎 1411
 */
public class _33_SearchInRotatedSortedArray {
  public static void main(String[] args) {
    Solution solution = new _33_SearchInRotatedSortedArray().new Solution();
  }
  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int search(int[] nums, int target) {
      int i = 0, j = nums.length - 1;
      while (i < j) {
        if (nums[i] == target) return i;
        if (nums[j] == target) return j;
        i++;
        j--;
      }
      return i == j && nums[i] == target ? i : -1;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
