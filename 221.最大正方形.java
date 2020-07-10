/*
 * @lc app=leetcode.cn id=221 lang=java
 *
 * [221] 最大正方形
 */

// @lc code=start
class Solution {
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        if(row==0) return 0;
        int col = matrix[0].length;
        // 记录最大的边长，记录面积的话稍微麻烦点
        int[][] dp = new int[row+1][col+1];

        int max = 0;
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=col; j++){
                if(matrix[i-1][j-1]=='0'){
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = 1 + Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
                // dp[i][j] = (int)Math.pow(Math.sqrt(tmp)+1, 2);
                max = Math.max(max, dp[i][j]);
            }
        }
        return max*max;
    }
}
// @lc code=end

