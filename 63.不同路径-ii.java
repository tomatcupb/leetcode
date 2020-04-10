import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=63 lang=java
 *
 * [63] 不同路径 II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int h = obstacleGrid.length;
        int w = obstacleGrid[0].length;
        boolean[][] isBlocked = new boolean[h][w];
        
        for(int i = 0; i<h; i++){
            for(int j = 0; j < w; j++){
                if(obstacleGrid[i][j]==1) isBlocked[i][j] = true;
            }
        }

        for(int i = 0; i<w; i++){
            if(isBlocked[0][i]){
                for(int j = i; j<w; j++){
                    obstacleGrid[0][j] = 0;
                }
                break;
            }else{
                obstacleGrid[0][i] = 1;
            }
        }
        for(int i = 0; i<h; i++){
            if(isBlocked[i][0]){
                for(int j = i; j<h; j++){
                    obstacleGrid[j][0] = 0;
                }
                break;
            }else{
                obstacleGrid[i][0] = 1;
            }
        }

        for(int i = 1; i<h; i++){
            for(int j = 1; j<w; j++){
                if(isBlocked[i][j]){
                    obstacleGrid[i][j] = 0;
                } else{
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }
            }
        }
        return obstacleGrid[h-1][w-1];
    }
}
// @lc code=end

