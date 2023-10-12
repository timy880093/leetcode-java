/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in
 * the range that is missing from the array.
 *
 * <p>Example 1:
 *
 * <p>Input: nums = [3,0,1] Output: 2 Explanation: n = 3 since there are 3 numbers, so all numbers
 * are in the range [0 ,3]. 2 is the missing number in the range since it does not appear in nums.
 *
 * <p>Example 2:
 *
 * <p>Input: nums = [0,1] Output: 2 Explanation: n = 2 since there are 2 numbers, so all numbers are
 * in the range [0 ,2]. 2 is the missing number in the range since it does not appear in nums.
 *
 * <p>Example 3:
 *
 * <p>Input: nums = [9,6,4,2,3,5,7,0,1] Output: 8 Explanation: n = 9 since there are 9 numbers, so
 * all numbers are in the range [0 ,9]. 8 is the missing number in the range since it does not
 * appear in nums.
 *
 * <p>Constraints:
 *
 * <p>n == nums.length 1 <= n <= 10⁴ 0 <= nums[i] <= n All the numbers of nums are unique.
 *
 * <p>Follow up: Could you implement a solution using only O(1) extra space complexity and O(n)
 * runtime complexity?
 *
 * <p>Related Topics Array Hash Table Math Binary Search Bit Manipulation Sorting 👍 10670 👎 3221
 */
public class _268_MissingNumber {
  public static void main(String[] args) {
    Solution solution = new _268_MissingNumber().new Solution();
    solution.missingNumber(new int[] {0, 1});
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    public int missingNumber(int[] nums) {
      int temp = 0;
      for (int i = 0; i < nums.length; i++) {
        // 先與當前陣列 XOR
        temp ^= nums[i];
        // 再與原陣列 XOR，相同的數會消失
        temp ^= i;
      }
      // 最後與原陣列長度 XOR
      temp ^= nums.length;
      return temp;
    }

    // 兩個獨立迴圈
    public int missingNumber2(int[] nums) {
      int length = nums.length;
      int[] ints = new int[length + 1];

      for (int num : nums) {
        ints[num] = 1;
      }
      for (int i = 0; i < ints.length; i++) {
        if (ints[i] == 0) return i;
      }
      return 0;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
