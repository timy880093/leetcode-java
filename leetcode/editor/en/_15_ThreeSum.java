import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i !=
 * j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * <p>Notice that the solution set must not contain duplicate triplets.
 *
 * <p>Example 1:
 *
 * <p>Input: nums = [-1,0,1,2,-1,-4] Output: [[-1,-1,2],[-1,0,1]] Explanation: nums[0] + nums[1] +
 * nums[2] = (-1) + 0 + 1 = 0. nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0. nums[0] + nums[3] +
 * nums[4] = (-1) + 2 + (-1) = 0. The distinct triplets are [-1,0,1] and [-1,-1,2]. Notice that the
 * order of the output and the order of the triplets does not matter.
 *
 * <p>Example 2:
 *
 * <p>Input: nums = [0,1,1] Output: [] Explanation: The only possible triplet does not sum up to 0.
 *
 * <p>Example 3:
 *
 * <p>Input: nums = [0,0,0] Output: [[0,0,0]] Explanation: The only possible triplet sums up to 0.
 *
 * <p>Constraints:
 *
 * <p>3 <= nums.length <= 3000 -10⁵ <= nums[i] <= 10⁵
 *
 * <p>Related Topics Array Two Pointers Sorting 👍 22670 👎 2069
 */
public class _15_ThreeSum {
  public static void main(String[] args) {
    Solution solution = new _15_ThreeSum().new Solution();
    List<List<Integer>> lists = solution.threeSum(new int[] {-1, 0, 1, -1, 4, 2});
    System.out.println(lists);
  }
  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    /*
    {-1, 0, 1, -1, 4, 2} => {-1, -1, 0, 1, 2, 4}
    任三數加總 = 0
    三數不可重複
     */
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> results = new ArrayList<>();
      if (nums.length < 3) return results;
      Arrays.sort(nums);
      for (int i = 0, len = nums.length; i < len - 2; i++) {
        // 相鄰兩數不重複
        if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
          int l = i + 1, r = len - 1;
          // 左點 < 右點
          while (l < r) {
            if (nums[i] + nums[l] + nums[r] < 0) l++;
            else if (nums[i] + nums[l] + nums[r] > 0) r--;
            else {
              results.add(Arrays.asList(nums[i], nums[l], nums[r]));
              // 左點、右點相鄰兩數不重複
              while (l < r && nums[l] == nums[l + 1]) l++;
              while (l < r && nums[r] == nums[r - 1]) r--;
              l++;
              r--;
            }
          }
        }
      }

      return results;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
