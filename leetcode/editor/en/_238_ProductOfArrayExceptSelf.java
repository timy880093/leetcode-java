import java.util.Arrays;

/**
 * Given an integer array nums, return an array answer such that answer[i] is
 * equal to the product of all the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
 * integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the
 * division operation.
 * <p>
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * <p>
 * Example 2:
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * <p>
 * 2 <= nums.length <= 10⁵
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit
 * integer.
 * <p>
 * <p>
 * <p>
 * Follow up: Can you solve the problem in O(1) extra space complexity? (The
 * output array does not count as extra space for space complexity analysis.)
 * <p>
 * Related Topics Array Prefix Sum 👍 15430 👎 864
 */

public class _238_ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Solution solution = new _238_ProductOfArrayExceptSelf().new Solution();
        solution.productExceptSelf(new int[]{1, 2, 3, 4});
//        solution.productExceptSelf(new int[]{2, 3, 5, 0});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            /*
            左半部正向遞增，右半部逆向遞減，每次迴圈左右相乘
            1-  2   3   4
            1   2-  3   4
            1   2   3-  4
            1   2   3   4-
             */
            int length = nums.length;
            int[] result = new int[length];
            Arrays.fill(result, 1);
            int l = 1;
            int r = 1;
            for (int i = 1; i < length; i++) {
                l *= nums[i - 1];
                r *= nums[length - 1 - i + 1];
                result[i] *= l;
                result[length - 1 - i] *= r;
            }
            return result;
        }

        public int[] productExceptSelf2(int[] nums) {
            // FIXME too long
            int[] results = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                int temp = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (i == j) continue;
                    temp *= nums[j];
                }
                results[i] = temp;
            }
            return results;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}