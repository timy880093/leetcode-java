/**
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For
 * example, the array nums = [0,1,2,4,5,6,7] might become:
 *
 * <p>[4,5,6,7,0,1,2] if it was rotated 4 times. [0,1,2,4,5,6,7] if it was rotated 7 times.
 *
 * <p>Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array
 * [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 *
 * <p>Given the sorted rotated array nums of unique elements, return the minimum element of this
 * array.
 *
 * <p>You must write an algorithm that runs in O(log n) time.
 *
 * <p>Example 1:
 *
 * <p>Input: nums = [3,4,5,1,2] Output: 1 Explanation: The original array was [1,2,3,4,5] rotated 3
 * times.
 *
 * <p>Example 2:
 *
 * <p>Input: nums = [4,5,6,7,0,1,2] Output: 0 Explanation: The original array was [0,1,2,4,5,6,7]
 * and it was rotated 4 times.
 *
 * <p>Example 3:
 *
 * <p>Input: nums = [11,13,15,17] Output: 11 Explanation: The original array was [11,13,15,17] and
 * it was rotated 4 times.
 *
 * <p>Constraints:
 *
 * <p>n == nums.length 1 <= n <= 5000 -5000 <= nums[i] <= 5000 All the integers of nums are unique.
 * nums is sorted and rotated between 1 and n times.
 *
 * <p>Related Topics Array Binary Search 👍 11784 👎 521
 */
public class _153_FindMinimumInRotatedSortedArray {
  public static void main(String[] args) {
    Solution solution = new _153_FindMinimumInRotatedSortedArray().new Solution();
    System.out.println(solution.findMin(new int[]{11,13,15,17}));
  }
  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    // time:O(log(N)) space:O(1)
    public int findMin(int[] nums) {
      int i = 0;
      int j = nums.length - 1;
      while (i < j) {
        if (nums[i] > nums[i + 1]) {
          return nums[i + 1];
        }
        if (nums[j - 1] > nums[j]) {
          return nums[j];
        }
        i++;
        j--;
      }
      return nums[0];
    }

    // time:O(N) space:O(1)
    public int findMin2(int[] nums) {
      int min = Integer.MAX_VALUE;
      for (int i = 1; i < nums.length; i++) {
        min = Math.min(nums[i], min);
      }
      return min;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
