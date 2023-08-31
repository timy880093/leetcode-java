/**
 * Given a 1-indexed array of integers numbers that is already sorted in non- decreasing order, find
 * two numbers such that they add up to a specific target number. Let these two numbers be
 * numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *
 * <p>Return the indices of the two numbers, index1 and index2, added by one as an integer array
 * [index1, index2] of length 2.
 *
 * <p>The tests are generated such that there is exactly one solution. You may not use the same
 * element twice.
 *
 * <p>Your solution must use only constant extra space.
 *
 * <p>Example 1:
 *
 * <p>Input: numbers = [2,7,11,15], target = 9 Output: [1,2] Explanation: The sum of 2 and 7 is 9.
 * Therefore, index1 = 1, index2 = 2. We return [1, 2].
 *
 * <p>Example 2:
 *
 * <p>Input: numbers = [2,3,4], target = 6 Output: [1,3] Explanation: The sum of 2 and 4 is 6.
 * Therefore index1 = 1, index2 = 3. We return [1, 3].
 *
 * <p>Example 3:
 *
 * <p>Input: numbers = [-1,0], target = -1 Output: [1,2] Explanation: The sum of -1 and 0 is -1.
 * Therefore index1 = 1, index2 = 2. We return [1, 2].
 *
 * <p>Constraints:
 *
 * <p>2 <= numbers.length <= 3 * 10⁴ -1000 <= numbers[i] <= 1000 numbers is sorted in non-decreasing
 * order. -1000 <= target <= 1000 The tests are generated such that there is exactly one solution.
 *
 * <p>Related Topics Array Two Pointers Binary Search 👍 9491 👎 1212
 */
public class _167_TwoSumIiInputArrayIsSorted {
  public static void main(String[] args) {
    Solution solution = new _167_TwoSumIiInputArrayIsSorted().new Solution();
  }
  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    // time:O(1)、space:O(1)
    // two pointer，因為已排序，找最左邊 & 最右邊當兩點，並根據 target 做參照，逐步往中間收攏，最後找出 index 要再+1
    public int[] twoSum(int[] nums, int target) {
      int i = 0, j = nums.length - 1;
      while (i < j) {
        if (nums[i] + nums[j] < target) i++;
        else if (nums[i] + nums[j] > target) j--;
        else break;
      }
      return new int[] {i + 1, j + 1};
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
