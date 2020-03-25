/*
 * @lc app=leetcode.cn id=867 lang=java
 *
 * [867] 转置矩阵
 */

// @lc code=start
class Solution {
    public int[][] transpose(int[][] A) {
        int height = A.length;
        if(height==0) return A;
        int width = A[0].length;

        int[][] res =  new int[width][height];
        for(int i =0; i< height; i++){
            for(int j = 0; j< width; j++){
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}
// @lc code=end

