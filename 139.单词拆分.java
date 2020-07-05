import java.util.List;

/*
 * @lc app=leetcode.cn id=139 lang=java
 *
 * [139] 单词拆分
 */

// @lc code=start
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        boolean[] dp = new boolean[len+1];
        dp[0] = true;
        for(int i = 1; i<= len; i++){
            for(int j = 0; j<i; j++){
                // 注意i,j的索引，dp的索引与s的索引差一位
                if(dp[j]==true && wordDict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }
}
// @lc code=end

