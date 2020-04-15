import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=542 lang=java
 *
 * [542] 01 矩阵
 */

// @lc code=start
class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        // 1. DFS尝试超时失败！
        // isSolved = new boolean[matrix.length][matrix[0].length];
        // for(int i = 0; i<matrix.length; i++){
        //     for(int j = 0; j<matrix[0].length; j++){
        //         matrix[i][j] = dfs(matrix, i, j, 0, new boolean[matrix.length][matrix[0].length], true);
        //     }
        // }
        // return matrix;
        

        // 2. 多源BFS
        /**
         * 1. Tree 只有 1 个 root，而图可以有多个源点，所以首先需要把多个源点都入队；
         * 2. Tree 是有向的因此不需要标识是否访问过，而对于无向图来说，必须得标志是否访问过哦！
         * 并且为了防止某个节点多次入队，需要在其入队之前就将其设置成已访问！
         */
        // int row = matrix.length;
        // int col = matrix[0].length;
        // Queue<int[]> q = new LinkedList<>();
        // for(int i = 0; i<row; i++){
        //     for(int j = 0; j<col; j++){
        //         if(matrix[i][j]==0){
        //             q.add(new int[]{i,j});
        //         } else{
        //             matrix[i][j] = -1;
        //         }
        //     }
        // }
        // while(!q.isEmpty()){
        //     int[] temp = q.remove();
        //     int x = temp[0];
        //     int y = temp[1];
        //     int[] dx = {-1, 1, 0, 0};
        //     int[] dy = {0, 0, -1, 1};
        //     for(int i = 0; i<4; i++){
        //         int newX = x + dx[i];
        //         int newY = y + dy[i];
        //         if(newX>=0 && newX<row && newY>=0 && newY< col && matrix[newX][newY]==-1){
        //             matrix[newX][newY] = matrix[x][y]+1;
        //             q.add(new int[]{newX, newY});
        //         }
        //     }
        // }
        // return matrix;

        // 3.dp：分别左上角和右下角
        int row = matrix.length;
        int col = matrix[0].length;
        // 左上角dp
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                // 设置边界特殊值
                if(matrix[i][j]==1) matrix[i][j] = row+col;
                if(i>0) matrix[i][j] = Math.min(matrix[i][j], matrix[i-1][j]+1);
                if(j>0) matrix[i][j] = Math.min(matrix[i][j], matrix[i][j-1]+1);
            }
        }
        // 右下角dp
        for(int i = row-1; i>=0; i--){
            for(int j = col-1; j>=0; j--){
                if(i<row-1) matrix[i][j] = Math.min(matrix[i][j], matrix[i+1][j]+1);
                if(j<col-1) matrix[i][j] = Math.min(matrix[i][j], matrix[i][j+1]+1);
            }
        }
        return matrix;

    }
    // boolean[][] isSolved;
    // private int dfs(int[][] matrix, int row, int col, int dis, boolean[][] isVisited, boolean flag){
    //     if(matrix[row][col]==0){
    //         return dis;
    //     }
    //     if(isSolved[row][col]) return matrix[row][col];
    //     isVisited[row][col] = true;
    //     int disUp = row>0&&flag? matrix[row-1][col]+1 : Integer.MAX_VALUE;
    //     int disLeft = col>0&&flag?matrix[row][col-1]+1 : Integer.MAX_VALUE;
    //     int minUpLeft = Math.min(disUp, disLeft);
    //     if (minUpLeft==1) return 1;
    //     int disDown = Integer.MAX_VALUE;
    //     int disRight = Integer.MAX_VALUE;
    //     if(row<matrix.length-1 && !isVisited[row+1][col]){
    //         isVisited[row+1][col] = true;
    //         disDown = dfs(matrix, row+1, col, dis+1, isVisited, false);
    //     }
    //     if(col<matrix[0].length-1 && !isVisited[row][col+1]){
    //         isVisited[row][col+1] = true;
    //         disRight = dfs(matrix, row, col+1, dis+1, isVisited, false);
    //     }
    //     matrix[row][col] = dis;
    //     isSolved[row][col] = true;
    //     return Math.min(Math.min(disDown, disUp), Math.min(disLeft, disRight));
    // }
}
// @lc code=end

