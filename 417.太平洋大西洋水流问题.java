import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=417 lang=java
 *
 * [417] 太平洋大西洋水流问题
 */

// @lc code=start
class Solution {
    // 效率较高（81.72%， 100%）
    int row, col;
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> ans = new ArrayList<>();
        row = matrix.length;
        if(row == 0) return ans;
        col = matrix[0].length;
        if(col == 0) return ans;
        boolean[][] pacific = new boolean[row][col]; 
        boolean[][] atlantic = new boolean[row][col]; 
        for(int i = 0; i<col; i++){
            helper(matrix, 0, i, pacific);
            helper(matrix, row-1, i, atlantic);
        }
        for(int i = 0; i<row; i++){
            helper(matrix, i, 0, pacific);
            helper(matrix, i, col-1, atlantic);
        }

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if (pacific[i][j]&&atlantic[i][j]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    ans.add(list);
                }
            }
        }
        return ans;

        // 效率较低(5%, 100%)
        // int row, col;
        // boolean upLeft, downRight;
        // List<List<Integer>> ans = new ArrayList<>();
        // row = matrix.length;
        // if(row == 0) return ans;
        // col = matrix[0].length;
        // if(col == 0) return ans;
        // for(int i = 0; i < row; i++){
        //     for(int j = 0; j < col; j++){
        //         boolean[][] isVisited = new boolean[row][col];
        //         helper(matrix, i, j, isVisited);
        //         if(upLeft && downRight){
        //             List<Integer> list = new ArrayList<>();
        //             list.add(i);
        //             list.add(j);
        //             ans.add(list);
        //         }
        //         upLeft = false;
        //         downRight = false;
        //     }
        // }
        // return ans;
    }

    int[] xIncr = {1,-1,0,0};
    int[] yIncr = {0,0,1,-1};
    int x, y;
    private void helper(int[][] matrix, int i, int j, boolean[][] sea) {
        sea[i][j] = true;
        for(int k = 0; k<4; k++){
            x = i + xIncr[k];
            y = j + yIncr[k];
            if(x>=0 && y>=0 && x<row && y<col && !sea[x][y] && matrix[x][y]>=matrix[i][j]){
                helper(matrix, x, y, sea);
            }
        }
    }

    // int[] xIncr = {1,-1,0,0};
    // int[] yIncr = {0,0,1,-1};
    // int x, y;
    // private void helper(int[][] matrix, int i, int j, boolean[][] isVisited){
    //     isVisited[i][j] = true;
    //     if(j==0 || i == 0) upLeft = true;
    //     if(j == col-1 || i == row-1) downRight = true;
    //     for(int k = 0; k<4; k++){
    //         x = i + xIncr[k];
    //         y = j + yIncr[k];
    //         if(x>=0 && y>=0 && x<row && y< col && !isVisited[x][y] && matrix[x][y]<=matrix[i][j]){
    //             helper(matrix, x, y, isVisited);
    //         }
    //     }
    // }
}
// @lc code=end

