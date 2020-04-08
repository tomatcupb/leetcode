/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int[] dp = new int[prices.length];
        dp[0] = 0;
        int min = prices[0];
        int ans = dp[0];
        for(int i = 1; i<dp.length; i++){
            min = min>prices[i]?prices[i]:min;
            dp[i] = Math.max(dp[i-1], prices[i]-min);
            if(dp[i]>ans) ans = dp[i];
        }
        return ans;
    }
}
// @lc code=end

