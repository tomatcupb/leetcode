import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        // 1.dfs基础解法
        // int row = grid.length;
        // if(row==0) return 0;
        // int col = grid[0].length;
        // int ans = 0;
        // isVisited = new boolean[row][col];
        // for(int i = 0;i<row;i++){
        //     for(int j = 0; j<col;j++){
        //         if(!isVisited[i][j] && grid[i][j]=='1'){
        //             isVisited[i][j] = true;
        //             helper(grid, i, j);
        //             ans ++;
        //         }
        //     }
        // }
        // return ans;

        // 2. dfs优化之原数组修改，减少一个isVisited数组
        // int row = grid.length;
        // if(row==0) return 0;
        // int col = grid[0].length;
        // int ans = 0;
        // for(int i = 0;i<row;i++){
        //     for(int j = 0; j<col;j++){
        //         if(grid[i][j]=='1'){
        //             grid[i][j] = '2';
        //             dfs(grid, i, j);
        //             ans ++;
        //         }
        //     }
        // }
        // return ans;

        // 3.bfs, 效率低于dfs
        int row = grid.length;
        if(row==0) return 0;
        int col = grid[0].length;
        int[] rowIncr = new int[]{1,-1,0,0};
        int[] colIncr = new int[]{0,0,1,-1};
        int ans = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(grid[i][j]=='1'){
                    grid[i][j]='2';
                    ans++;
                    q.add(new int[]{i,j});
                    while(!q.isEmpty()){
                        int[] p = q.remove();
                        for(int k = 0; k< 4; k++){
                            int newI = p[0]+rowIncr[k];
                            int newJ = p[1]+colIncr[k];
                            if(newI>=0 && newJ>=0 && newJ<col && newI<row && grid[newI][newJ]=='1'){
                                grid[newI][newJ] = '2';
                                q.add(new int[]{newI,newJ});
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
    // boolean[][] isVisited;
    // int[] rowIncr = {1,-1,0,0};
    // int[] colIncr = {0,0,1,-1};
    // private void helper(char[][] grid, int i, int j){
    //     int row = grid.length;
    //     int col = grid[0].length;
    //     for(int k = 0; k<4; k++){
    //         int newI = i+rowIncr[k];
    //         int newJ = j + colIncr[k];
    //         if(newI>=0 && newJ>=0 && newJ<col && newI<row && grid[newI][newJ]=='1' && !isVisited[newI][newJ]){
    //             isVisited[newI][newJ] = true;
    //             helper(grid, newI, newJ);
    //         }
    //     }
    // }

    // int[] rowIncr = {1,-1,0,0};
    // int[] colIncr = {0,0,1,-1};
    // private void dfs(char[][] grid, int i, int j) {
    //     int row = grid.length;
    //     int col = grid[0].length;
    //     for (int k = 0; k < 4; k++) {
    //         int newI = i + rowIncr[k];
    //         int newJ = j + colIncr[k];
    //         if (newI >= 0 && newJ >= 0 && newJ < col && newI < row && grid[newI][newJ] == '1') {
    //             grid[newI][newJ] = '2';
    //             dfs(grid, newI, newJ);
    //         }
    //     }
    // }
}
// @lc code=end

