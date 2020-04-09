import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=343 lang=java
 *
 * [343] 整数拆分
 */

// @lc code=start
class Solution {
    public int integerBreak(int n) {
        // 1. 直接回溯超时
        // backtrack(0, n, 1);
        // return ans;

        // 2. 动态规划
        // int[] dp = new int[n+1];
        // dp[0] = 0;
        // dp[1] = 1;
        // dp[2] = 1;
        // for(int i = 3; i<=n; i++){
        //     for(int j=1; j<i; j++){
        //         // 此处比较三个数的最小值，因为dp[i-j]中拆分的数不包括（0，n）!,所以加上j*(i-j)
        //         dp[i] = Math.max(Math.max(dp[i], j*dp[i-j]), j*(i-j));
        //     }
        // }
        // return dp[n];
        memo = new int[n];
        return backtrackPro(n);
    }

    // int ans = 0;
    // private void backtrack(int count, int n, int product){
    //     if(n==0){
    //         if(product>ans && count!=1) ans = product;
    //     }

    //     for(int i = 1; i<=n; i++){
    //         if(i>n) return;
    //         backtrack(count+1, n-i, product*i);
    //     }
    // }

    // 记忆化搜索
    int[] memo;
    private int backtrackPro(int n){
        if(n==2){
            memo[n-1] = 1;
            return 1;
        }
        if(memo[n-1]!=0) return memo[n-1];
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<n; i++){
            int res = backtrackPro(n-i);
            max = res>0? Math.max(Math.max(max, res*i), i*(n-i)):max;
        }
        memo[n-1] = max;
        return max;
    }
}
// @lc code=end

