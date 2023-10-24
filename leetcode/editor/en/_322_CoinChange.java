import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * You are given an integer array coins representing coins of different denominations and an integer
 * amount representing a total amount of money.
 *
 * <p>Return the fewest number of coins that you need to make up that amount. If that amount of
 * money cannot be made up by any combination of the coins, return -1.
 *
 * <p>You may assume that you have an infinite number of each kind of coin.
 *
 * <p>Example 1:
 *
 * <p>Input: coins = [1,2,5], amount = 11 Output: 3 Explanation: 11 = 5 + 5 + 1
 *
 * <p>Example 2:
 *
 * <p>Input: coins = [2], amount = 3 Output: -1
 *
 * <p>Example 3:
 *
 * <p>Input: coins = [1], amount = 0 Output: 0
 *
 * <p>Constraints:
 *
 * <p>1 <= coins.length <= 12 1 <= coins[i] <= 2³¹ - 1 0 <= amount <= 10⁴
 *
 * <p>Related Topics Array Dynamic Programming Breadth-First Search 👍 17870 👎 406
 */
public class _322_CoinChange {
  public static void main(String[] args) {
    Solution solution = new _322_CoinChange().new Solution();
    solution.coinChange(new int[] {1, 2, 5}, 11);
  }

  // leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int coinChange(int[] coins, int amount) {
      int max = amount + 1;
      int[] dp = new int[max];
      Arrays.fill(dp, max);
      dp[0] = 0;
      for (int a = 1; a <= amount; a++) {
        for (int coin : coins) {
          // 每個金額所花費的 coin 數量
          if (coin <= a) {
            // 若 coin < 金額才做
            dp[a] = Math.min(dp[a], dp[a - coin] + 1);
//            System.out.println("coin=" + coin + ",amount=" + a + ",result=" + dp[a]);
          }
        }
      }
      return dp[amount] > amount ? -1 : dp[amount];
    }
  }
  // leetcode submit region end(Prohibit modification and deletion)

}
