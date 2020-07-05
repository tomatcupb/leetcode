/*
 * @lc app=leetcode.cn id=85 lang=java
 *
 * [85] 最大矩形
 */

// @lc code=start
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        if(row==0) return 0;
        int col = matrix[0].length;
        int ans = 0;
        for(int i = 0; i< row; i++){
            for(int j = 0; j< col; j++){
                if(matrix[i][j]=='1'){
                    ans = Math.max(ans, helper(matrix, i, j));
                }
            }
        }
        return ans;
    }

    private int helper(char[][] matrix, int i, int j){
        int max = 0, min = matrix[0].length+1;;
        for(int m = i; m<matrix.length; m++){
            int tmp = 0;
            for(int n = j; n<matrix[0].length; n++){
                if(matrix[m][n]=='1'){
                    tmp++;
                } else{
                    break;
                }
            }
            min = Math.min(min, tmp);
            max = Math.max(max, (m-i+1)*min);
        }
        return max;
    }
}
// @lc code=end

