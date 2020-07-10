import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=354 lang=java
 *
 * [354] 俄罗斯套娃信封问题
 */

// @lc code=start
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int len = envelopes.length;
        if(len<=1) return len;
        Arrays.sort(envelopes, (e1,e2)->e1[0]==e2[0]?e1[1]-e2[1]:e1[0]-e2[0]);
        int[] dp = new int[len];
        Arrays.fill(dp,1);
        int max = 1;
        for(int i = 1; i< len; i++){
            for(int j = 0; j<i; j++){
                if(envelopes[i][0]>envelopes[j][0] && envelopes[i][1]>envelopes[j][1]){
                    dp[i] = Math.max(dp[j]+1, dp[i]);
                    max = Math.max(max, dp[i]);
                }
            }
        }
        return max;
    }
}
// @lc code=end

