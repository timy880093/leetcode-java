/**
 * Given an integer array nums sorted in non-decreasing order, remove the
 * duplicates in-place such that each unique element appears only once. The relative order
 * of the elements should be kept the same.
 * <p>
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the
 * first k elements of nums should hold the final result. It does not matter what you
 * leave beyond the first k elements.
 * <p>
 * Return k after placing the final result in the first k slots of nums.
 * <p>
 * Do not allocate extra space for another array. You must do this by modifying
 * the input array in-place with O(1) extra memory.
 * <p>
 * Custom Judge:
 * <p>
 * The judge will test your solution with the following code:
 * <p>
 * <p>
 * int[] nums = [...]; // Input array
 * int[] expectedNums = [...]; // The expected answer with correct length
 * <p>
 * int k = removeDuplicates(nums); // Calls your implementation
 * <p>
 * assert k == expectedNums.length;
 * for (int i = 0; i < k; i++) {
 * assert nums[i] == expectedNums[i];
 * }
 * <p>
 * <p>
 * If all assertions pass, then your solution will be accepted.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2,_]
 * Explanation: Your function should return k = 2, with the first two elements of
 * nums being 1 and 2 respectively.
 * It does not matter what you leave beyond the returned k (hence they are
 * underscores).
 * <p>
 * <p>
 * Example 2:
 * <p>
 * <p>
 * Input: nums = [0,0,1,1,1,2,2,3,3,4]
 * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of
 * nums being 0, 1, 2, 3, and 4 respectively.
 * It does not matter what you leave beyond the returned k (hence they are
 * underscores).
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * <p>
 * 1 <= nums.length <= 3 * 10⁴
 * -100 <= nums[i] <= 100
 * nums is sorted in non-decreasing order.
 * <p>
 * <p>
 * Related Topics Array Two Pointers 👍 8680 👎 12413
 */

public class _26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution solution = new _26_RemoveDuplicatesFromSortedArray().new Solution();
        solution.removeDuplicates(new int[]{1, 1, 2});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int removeDuplicates(int[] nums) {
            // default add count 1 for nums[0]
            int count = 1;
            // declare {len = nums.length} is redundant
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] == nums[i]) continue;
                nums[count] = nums[i];
                count++;
            }
            return count;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}