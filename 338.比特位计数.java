/*
 * @lc app=leetcode.cn id=338 lang=java
 *
 * [338] 比特位计数
 */

// @lc code=start
class Solution {
    public int[] countBits(int num) {
        /**
         * dp
         * 奇数：dp[i] = dp[i>>1]+1;
         * 偶数：dp[i] = dp[i>>1]
         */
        int[] dp = new int[num+1];
        if(num==0) return dp;
        dp[1] = 1;
        for(int i = 2; i<=num; i++){
            // dp[i] = dp[i>>1]+ i%2==1?1:0;
            dp[i] = dp[i>>1]+ i%2;
        }
        return dp;
    }
}
// @lc code=end

