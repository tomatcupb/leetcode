/*
 * @lc app=leetcode.cn id=357 lang=java
 *
 * [357] 计算各个位数不同的数字个数
 */

// @lc code=start
class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int[] dp = new int[11];
        dp[0] = 1;
        dp[1] = 10;
        if(n>10) n = 10;
        for(int i = 2; i<=n; i++){
            int product = 81;
            for(int j = i-2; j>0; j--){
                product *= 10+j-i;
            }
            //1.首位为0：dp[i-1]
            //2.首位不为0：阶乘product
            dp[i] = dp[i-1]+product;
        }
        return dp[n];
    }
}
// @lc code=end

