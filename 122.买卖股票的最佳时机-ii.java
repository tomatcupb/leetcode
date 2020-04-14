/*
 * @lc app=leetcode.cn id=122 lang=java
 *
 * [122] 买卖股票的最佳时机 II
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        // 1.dp
        // if(prices.length==0) return 0;
        // int[][] dp =new int[prices.length][2];
        // dp[0][0] = 0;
        // dp[0][1] = -prices[0];
        // for(int i = 1; i<dp.length; i++){
        //     dp[i][0] = Math.max(dp[i-1][0], prices[i]+dp[i-1][1]);
        //     dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0]-prices[i]);
        // }
        // return dp[prices.length-1][0];

        // 2. dp考虑状态压缩，即把数组换成滚动的两个数
        // if(prices.length==0) return 0;
        // int cashHold = 0;
        // int stockHold = -prices[0];
        // int temp;
        // for(int i = 1; i<prices.length; i++){
        //     temp = cashHold;
        //     cashHold = Math.max(cashHold, prices[i]+stockHold);
        //     stockHold = Math.max(stockHold, temp-prices[i]);
        // }
        // return cashHold;

        // 3. 贪心法则：所有的都是低点买入，高点卖出
        // 效率远高于dp
        int sum = 0;
        int diff = 0;
        for(int i = 1; i< prices.length; i++){
            diff = prices[i] - prices[i-1];
            if(diff>0) sum += diff;
        }
        return sum;
    }
}
// @lc code=end

