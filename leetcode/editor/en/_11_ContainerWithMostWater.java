/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the
 * two endpoints of the iᵗʰ line are (i, 0) and (i, height[i]).
 *
 * <p>Find two lines that together with the x-axis form a container, such that the container
 * contains the most water.
 *
 * <p>Return the maximum amount of water a container can store.
 *
 * <p>Notice that you may not slant the container.
 *
 * <p>Example 1:
 *
 * <p>Input: height = [1,8,6,2,5,4,8,3,7] Output: 49 Explanation: The above vertical lines are
 * represented by array [1,8,6,2,5,4,8,3, 7]. In this case, the max area of water (blue section) the
 * container can contain is 49.
 *
 * <p>Example 2:
 *
 * <p>Input: height = [1,1] Output: 1
 *
 * <p>Constraints:
 *
 * <p>n == height.length 2 <= n <= 10⁵ 0 <= height[i] <= 10⁴
 *
 * <p>Related Topics Array Two Pointers Greedy 👍 26583 👎 1455
 */
public class _11_ContainerWithMostWater {
  public static void main(String[] args) {
    Solution solution = new _11_ContainerWithMostWater().new Solution();
    solution.maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7});
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int maxArea(int[] height) {
      if (height.length == 1) return 0;
      int i = 0, j = height.length - 1, temp, ans = 0;
      while (i < j) {
        temp = (j - i) * Math.min(height[i], height[j]);
        ans = Math.max(temp, ans);
        if (height[i] > height[j]) j--;
        else i++;
      }
      return ans;
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
