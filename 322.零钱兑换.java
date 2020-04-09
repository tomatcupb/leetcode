
/*
 * @lc app=leetcode.cn id=322 lang=java
 *
 * [322] 零钱兑换
 */

// @lc code=start
class Solution {
    public int coinChange(int[] coins, int amount) {
        // 1. dp二维数组
        // int[][] dp = new int[coins.length+1][amount+1];
        // Arrays.fill(dp[0], -1);
        // for(int i = 1; i<dp.length; i++){
        //     for(int j = 1; j<dp[0].length; j++){
        //         if(coins[i-1]>j){
        //             dp[i][j] = dp[i-1][j];
        //         } else {
        //             int newPut = dp[i][j-coins[i-1]]==-1?dp[i-1][j]:1+dp[i][j-coins[i-1]];
        //             dp[i][j] = dp[i-1][j]==-1?newPut:Math.min(newPut, dp[i-1][j]);
        //         }
        //     }
        // }
        // return dp[coins.length][amount];

        // 2. dp一维数组
        // int[] dp = new int[amount+1];
        // Arrays.fill(dp, amount+1);
        // dp[0] = 0;
        // for(int i = 1; i<dp.length; i++){
        //     for(int coin : coins){
        //         if(i>=coin && dp[i-coin]!=amount+1){
        //             dp[i] = Math.min(dp[i], 1+dp[i-coin]);
        //         }
        //     }
        // }
        // return dp[amount]==amount+1?-1:dp[amount];

        // 3. 直接回溯超时
        // backtrack(amount, 0, coins);
        // return ans==Integer.MAX_VALUE?-1:ans;

        // 4. 记忆搜索
        memo = new int[amount];
        return backtrackPro(amount, coins);
    }

    // int ans = Integer.MAX_VALUE;
    // private void backtrack(int amount, int count, int[] coins){
    //     if(amount==0){
    //         if(count<ans) ans = count;
    //         return;
    //     }

    //     for(int i = 0; i<coins.length; i++){
    //         if(amount < coins[i]) return;
    //         backtrack(amount-coins[i], count+1, coins);
    //     }
    // }

    int[] memo;
    private int backtrackPro(int amount, int[] coins){
        if(amount<0) return -1;
        if(amount==0) return 0;
        if(memo[amount-1]!=0) return memo[amount-1];
        int min = amount+1;
        for(int i = 0; i<coins.length; i++){
            int res = backtrackPro(amount-coins[i], coins);
            min = res==-1?min:Math.min(res+1, min);
        }
        // 记得此处赋值，否则无法利用之前的最优解！
        memo[amount-1] = min==amount+1?-1:min;
        return memo[amount-1];
    }
}
// @lc code=end

