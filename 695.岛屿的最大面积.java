import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=695 lang=java
 *
 * [695] 岛屿的最大面积
 */

// @lc code=start
class Solution {
    // int row;
    // int col;
    public int maxAreaOfIsland(int[][] grid) {
        // 1. DFS
        // int max = 0;
        // row = grid.length;
        // col = grid[0].length;
        // for(int i = 0; i< row; i++){
        //     for(int j = 0; j< col; j++){
        //         if(grid[i][j]==1){
        //             helper(grid, i, j);
        //             max = Math.max(max, sum);
        //             sum = 0;
        //         }
        //     }
        // }
        // return max;

        // 2. BFS
        int row = grid.length;
        int col = grid[0].length;
        int sum = 0;
        int max = 0;
        int x, y;
        int newX, newY;
        int[] temp;
        int[] xIcr = {1,-1,0,0};
        int[] yIcr = {0,0,1,-1};
        Queue<int[]> q =  new LinkedList<>();
        for(int i = 0; i<row; i++){
            for(int j = 0; j< col; j++){
                if(grid[i][j]==1){
                    sum = 0;
                    // 入队列的同时就要记得标记，否则无限循环了！
                    grid[i][j] = -1;
                    q.add(new int[]{i,j});
                    while(!q.isEmpty()){
                        temp = q.remove();
                        sum++;
                        x = temp[0];
                        y = temp[1];
                        for(int k = 0; k<4; k++){
                            newX = x+xIcr[k];
                            newY = y+yIcr[k];
                            if(newX<0 || newX>=row || newY<0 || newY>= col) continue;
                            if(grid[newX][newY]==1){
                                grid[newX][newY] = -1;
                                q.add(new int[]{newX,newY});
                            }
                        }
                    }
                    max = Math.max(max, sum);
                }
            }
        }
        return max;
    }

    // int sum = 0;
    // int[] x = {1,-1,0,0};
    // int[] y = {0,0,1,-1};
    // private void helper(int[][] grid, int i, int j){
    //     if(i<0 || i>=row || j<0 || j>=col || grid[i][j]!=1) return;
    //     sum ++;
    //     grid[i][j] = -1;
    //     for(int k = 0; k<4; k++){
    //         helper(grid, i+x[k], j+y[k]);
    //     }
    // }
}
// @lc code=end

