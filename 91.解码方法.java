/*
 * @lc app=leetcode.cn id=91 lang=java
 *
 * [91] 解码方法
 */

// @lc code=start
class Solution {
    public int numDecodings(String s) {
        int len = s.length();
        int[] dp = new int[len];
        if(len==0) return 0;
        dp[0] = s.charAt(0)=='0'?0:1;
        if(len==1 || dp[0] == 0) return dp[0];

        if(s.charAt(1)=='0'){
            if(s.charAt(0)>'2'){
                return 0;
            } else{
                dp[1] = 1;
            }
        } else if(s.charAt(0)>'2' || (s.charAt(0)=='2' && s.charAt(1)>'6')){
            dp[1] = 1;
        } else{
            dp[1] = 2;
        }

        for(int i =2 ; i<len; i++){
            if(s.charAt(i-1)=='0'){
                dp[i] = s.charAt(i)=='0'?0:dp[i-1];
                if(s.charAt(i)=='0'){
                    return 0;
                } else{
                    dp[i] = dp[i-1];
                }
            } else if(s.charAt(i)=='0'){
                if(s.charAt(i-1) >'2'){
                    return 0;
                } else{
                    dp[i] = dp[i-2];
                }
            } else if(s.charAt(i-1)>'2' || (s.charAt(i-1)=='2' && s.charAt(i)>'6')){
                dp[i] = dp[i-1];
            } else{
                dp[i] = dp[i-1]+dp[i-2];
            }
        }
        return dp[len-1];
    }
}
// @lc code=end

