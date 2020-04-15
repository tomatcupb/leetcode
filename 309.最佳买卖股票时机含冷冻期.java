/*
 * @lc app=leetcode.cn id=309 lang=java
 *
 * [309] 最佳买卖股票时机含冷冻期
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int cashHold = 0;
        int stcokHold  = -prices[0];
        int rest = 0;
        for(int i = 1; i<prices.length; i++){
            int temp1 = cashHold;
            int temp2 = stcokHold;
            cashHold = Math.max(cashHold, rest);
            stcokHold = Math.max(stcokHold, temp1-prices[i]);
            rest = prices[i] + temp2;
        }
        return Math.max(Math.max(cashHold, stcokHold), rest);
    }
}
// @lc code=end

