import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=240 lang=java
 *
 * [240] 搜索二维矩阵 II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // o(n)时间复杂度
        // int row = matrix.length;
        // if(row==0) return false;
        // int col = matrix[0].length;
        // if(col==0) return false;
        // List<Integer> list = new ArrayList<>();
        // for(int i = 0; i<row; i++){
        //     if(matrix[i][0]<=target && matrix[i][col-1]>=target) list.add(i);
        // }
        // for(int rowNum : list){
        //     if(binarySearch(matrix, target, rowNum)) return true;
        // }
        
        // 二分稍微优化
        // int row = matrix.length;
        // if(row==0) return false;
        // int col = matrix[0].length;
        // if(col==0) return false;

        // int left = 0, right = row-1;
        // while(left<right){
        //     int mid = (left+right)>>>1;
        //     if(matrix[mid][0]>=target){
        //         right = mid;
        //     } else{
        //         left = mid+1;
        //     }
        // }

        // List<Integer> list = new ArrayList<>();
        // for(int i = 0; i<=left; i++){
        //     if(matrix[i][col-1]>=target) list.add(i);
        // }
        // for(int rowNum : list){
        //     if(binarySearch(matrix, target, rowNum)) return true;
        // }
        // return false;

        int row = matrix.length;
        if(row==0) return false;
        int col = matrix[0].length;
        if(col==0) return false;

        int m = 0, n = col-1;
        while(m<row && n>=0){
            if(matrix[m][n]==target) return true;
            if(matrix[m][n]>target){
                n--;
            } else{
                m++;
            }
        }
        return false;
    }

    // private boolean binarySearch(int[][] matrix, int target, int row){
    //     int[] arr = matrix[row];
    //     int left = 0, right = arr.length-1;
    //     while(left<=right){
    //         int mid = (left+right)>>>1;
    //         if(arr[mid]==target) return true;
    //         if(arr[mid]>target){
    //             right = mid-1;
    //         } else{
    //             left = mid+1;
    //         }
    //     }
    //     return false;
    // }
}
// @lc code=end

