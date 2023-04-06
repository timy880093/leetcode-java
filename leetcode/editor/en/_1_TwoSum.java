import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * <p>
 * Example 2:
 * <p>
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * <p>
 * <p>
 * Example 3:
 * <p>
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * <p>
 * 2 <= nums.length <= 10⁴
 * -10⁹ <= nums[i] <= 10⁹
 * -10⁹ <= target <= 10⁹
 * Only one valid answer exists.
 * <p>
 * <p>
 * <p>
 * Follow-up: Can you come up with an algorithm that is less than
 * O(n²) time complexity?
 * <p>
 * Related Topics Array Hash Table 👍 39457 👎 1272
 */

public class _1_TwoSum {
    public static void main(String[] args) {
        Solution solution = new _1_TwoSum().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0, len = nums.length; i < len; i++) {
                int diff = target - nums[i];
                if (map.containsKey(diff)) {
                    return new int[]{map.get(diff), i};
                }
                map.put(nums[i], i);
            }
            return null;
        }

        public int[] twoSum2(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < len; i++) {
                int diff = target - nums[i];
                if (map.get(diff) == i) continue;
                if (map.containsKey(diff)) {
                    return new int[]{i, map.get(diff)};
                }
            }

            return null;
        }

        public int[] twoSum1(int[] nums, int target) {
            int len = nums.length;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (i == j) continue;
                    if (nums[j] == target - nums[i]) {
                        return new int[]{i, j};
                    }
                }
            }
            return new int[0];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}