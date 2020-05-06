/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int row = matrix.length;
        // if(row==0) return false;
        // int col = matrix[0].length;
        // if(col==0) return false;

        // int l = 0, r = row-1, mid;
        // while(l<r){
        //     mid = (l+r)/2;
        //     if(matrix[mid][0]<=target){
        //         l = mid+1;
        //     } else{
        //         r = mid;
        //     }
        // }
        // if(matrix[l][col-1]<target) return false;
        // row = l==0||(matrix[l][0]<=target)?l:l-1;
        // l = 0;
        // r = col-1;
        // while(l<=r){
        //     mid = (l+r)/2;
        //     if(matrix[row][mid]==target){
        //         return true;
        //     } else if(matrix[row][mid]>target){
        //         r = mid-1;
        //     } else{
        //         l = mid +1;
        //     }
        // }
        // return false;
        
        int row = matrix.length;
        if(row==0) return false;
        int col = matrix[0].length;
        if(col==0) return false;

        int l = 0, r = row*col-1, mid;
        int x,y;
        while(l<=r){
            mid = (l+r)/2;
            x = mid/col;
            y = mid%col;
            if(matrix[x][y]==target){
                return true;
            } else if(matrix[x][y]>target){
                r= mid-1;
            } else{
                l = mid+1;
            }
        }
        return false;
    }
}
// @lc code=end

