/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        /**
         * 顺时针填表
         * 方向：右->下->左->上
         */
        int[][] ans = new int[n][n];
        int j = 0, k = -1;
        for(int i = 1; i<=n*n;){
            // 向右填表
            if(k+1<n && ans[j][k+1]==0){
                ans[j][++k] = i++;
            // 向下填表
            } else if(j+1<n && ans[j+1][k]==0){
                ans[++j][k] = i++;
            // 向左填表
            } else if(k-1>=0 && ans[j][k-1]==0){
                ans[j][--k] = i++;
            // 向上填表
            } else{
                // 此处需要注意的是：一旦向上，必须先把上边的填完，才能向右！
                while(j-1>=0 && ans[j-1][k]==0){
                    ans[--j][k] = i++;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

