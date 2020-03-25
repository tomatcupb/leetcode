/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */

// @lc code=start
class Solution {
    public int fib(int N) {
        // if(N<=1){
        //     return N;
        // }
        // return fib(N-1)+fib(N-2);
        
        int[] dp = new int[3];
        dp[1] = 1;
        for(int i = 2; i<=N; i++){
            dp[i%3] = dp[(i+1)%3] + dp[(i+2)%3];
        }
        return dp[N%3];
    }
}
// @lc code=end

