import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=935 lang=java
 *
 * [935] 骑士拨号器
 */

// @lc code=start
class Solution {
    public int knightDialer(int N) {
        final int MOD = (int)1e9+7;
        int[][]dp = new int[N][10];
        Arrays.fill(dp[0],1);
        for(int i = 1; i<N; i++){
            dp[i][0] = (dp[i-1][4]+dp[i-1][6])%MOD;
            dp[i][1] = (dp[i-1][6]+dp[i-1][8])%MOD;
            dp[i][2] = (dp[i-1][7]+dp[i-1][9])%MOD;
            dp[i][3] = (dp[i-1][4]+dp[i-1][8])%MOD;
            dp[i][4] = ((dp[i-1][0]+dp[i-1][3])%MOD+dp[i-1][9])%MOD;
            dp[i][5] = 0;
            dp[i][6] = ((dp[i-1][1]+dp[i-1][7])%MOD+dp[i-1][0])%MOD;
            dp[i][7] = (dp[i-1][2]+dp[i-1][6])%MOD;
            dp[i][8] = (dp[i-1][1]+dp[i-1][3])%MOD;
            dp[i][9] = (dp[i-1][2]+dp[i-1][4])%MOD;
        }
        int ans = 0;
        for(int i = 0; i<10; i++){
            ans = (ans + dp[N-1][i])%MOD;
        }
        return ans;
    }
}
// @lc code=end

