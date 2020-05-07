/*
 * @lc app=leetcode.cn id=279 lang=java
 *
 * [279] 完全平方数
 */

// @lc code=start
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <=n; i++){
            int min  = Integer.MAX_VALUE;
            for(int j = 1; j*j<=i; j++){
                min = Math.min(min, 1+dp[i-j*j]);
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
// @lc code=end

