/*
 * @lc app=leetcode.cn id=714 lang=java
 *
 * [714] 买卖股票的最佳时机含手续费
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices, int fee) {
        // 1. dp
        // if(prices.length==0) return 0;
        // int cashHold = 0;
        // int stockHold = -prices[0];
        // for(int i = 1; i< prices.length; i++){
        //     int temp = cashHold;
        //     cashHold = Math.max(cashHold, prices[i]+stockHold-fee);
        //     stockHold = Math.max(stockHold, temp-prices[i]);
        // }
        // return cashHold;

        // 2. greedy
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i< prices.length; i++){
            if(min>prices[i]) min = prices[i];
            if((i<prices.length-1 && prices[i]-min>fee && prices[i+1]<prices[i]) || prices[i]-min>fee){
                sum += prices[i]-min-fee;
                // 这一步是关键
                /**
                 * 证明：
                 * [a,b,c,d]
                 * b-a+d-c-2*fee>d-a-fee
                 * b-fee>c
                 * 即下一次买入的价格要小于b-fee才能使交易两次的收益大于交易一次的结果
                 */
                min = prices[i]-fee;
            }
        }
        return sum;
    }
}
// @lc code=end

