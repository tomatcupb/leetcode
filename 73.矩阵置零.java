import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=73 lang=java
 *
 * [73] 矩阵置零
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        HashSet<Integer> setRow = new HashSet<>();
        HashSet<Integer> setColumn = new HashSet<>();

        for(int i = 0; i<m; i++){
            for(int j = 0; j< n; j++){
                if(matrix[i][j] == 0){
                    setRow.add(i);
                    setColumn.add(j);
                }
            }
        }

        for(Integer row : setRow){
            for(int i = 0; i<n; i++){
                matrix[row][i] = 0;
            }
        }
        for(Integer col : setColumn){
            for(int i = 0; i<m; i++){
                matrix[i][col] =0;
            }
        }


        // int m = matrix.length;
        // int n = matrix[0].length;
        // for(int i = 0; i<m; i++){
        //     for(int j = 0; j< n; j++){
        //         if(matrix[i][j] == 0){
        //             markNoZero(matrix, i, j);
        //         }
        //     }
        // }

        // for(int i = 0; i<m; i++){
        //     for(int j = 0; j< n; j++){
        //         if(matrix[i][j] == -Integer.MAX_VALUE){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
    }

    // private void markNoZero(int[][] matrix, int row, int col){
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     for(int i = 0; i<n; i++){
    //         if(matrix[row][i]!=0) matrix[row][i] = -Integer.MAX_VALUE;
    //     }

    //     for(int i = 0; i<m; i++){
    //         if(matrix[i][col]!=0) matrix[i][col] = -Integer.MAX_VALUE;
    //     }
    // }
}
// @lc code=end

