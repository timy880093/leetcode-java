/**
 * You are given an array prices where prices[i] is the price of a given stock on
 * the iᵗʰ day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and
 * choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot
 * achieve any profit, return 0.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-
 * 1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must
 * buy before you sell.
 * <p>
 * <p>
 * Example 2:
 * <p>
 * <p>
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * <p>
 * 1 <= prices.length <= 10⁵
 * 0 <= prices[i] <= 10⁴
 * <p>
 * <p>
 * Related Topics Array Dynamic Programming 👍 21287 👎 675
 */

public class _121_BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        Solution solution = new _121_BestTimeToBuyAndSellStock().new Solution();
//        int i = solution.maxProfit(new int[]{2, 4, 1});
//        int i = solution.maxProfit(new int[]{2, 1, 2, 0, 1});
        int i = solution.maxProfit(new int[]{7, 4, 6, 3, 11, 1, 10});
//        [7,2,6,1,5,2,10]
        assert i == 2;
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int maxProfit(int[] prices) {
            int min = prices[0];
            int profit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < min) min = prices[i];
                if (prices[i] - min > profit) profit = prices[i] - min;
            }
            return profit;
        }

        public int maxProfit1TooLong(int[] prices) {
            int profit = 0;
            for (int i = 0; i < prices.length - 1; i++) {
                for (int j = i + 1; j < prices.length; j++) {
                    int p = prices[j] - prices[i];
                    if (p > profit)
                        profit = p;
                }
            }
            return profit;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}