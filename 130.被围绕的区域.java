import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=130 lang=java
 *
 * [130] 被围绕的区域
 */

// @lc code=start
class Solution {
    public void solve(char[][] board) {
        // 使用了isVisited和list，效率较低（13.03%，6.25%）
        // row = board.length;
        // if(row<=1) return;
        // col = board[0].length;
        // isVisited = new boolean[row][col];
        // list =  new ArrayList<>();
        // for(int i = 0; i < row; i++){
        //     for(int j = 0; j<col; j++){
        //         helper(board, i, j);
        //         if(!flag && !list.isEmpty()){
        //             for(int[] index: list){
        //                 board[index[0]][index[1]] = 'X';
        //             }
        //         }
        //         flag = false;
        //         list.clear();
        //     }
        // }
        

        // 效率提高（98.49%, 56.25%）
        // 把与边界相连的'O'找出来即可
        row = board.length;
        if(row<=1) return;
        col = board[0].length;
        if(col<=1) return;
        for(int j = 0; j< col; j++) helper(board, 0, j, 'A');
        for(int j = 0; j< col; j++) helper(board, row-1, j, 'A');
        for(int i = 0; i< row; i++) helper(board, i, 0, 'A');
        for(int i = 0; i< row; i++) helper(board, i, col-1, 'A');

        for(int i = 0; i< row; i++){
            for(int j = 0; j< col; j++){
                if(board[i][j]=='O') board[i][j]='X';
                if(board[i][j]=='A') board[i][j]='O';
            }
        }
        
    }
    int row, col;
    int[] xIncr = {1,-1,0,0};
    int[] yIncr = {0,0,1,-1};
    private void helper(char[][] board, int i, int j, char T){
        if(board[i][j]=='O'){
            board[i][j] = T;
            for(int k = 0; k < 4; k++){
                int x = i + xIncr[k];
                int y = j + yIncr[k];
                if(x>=0 && x<row && y>=0 && y<col){
                    helper(board, x, y, T);
                }
            }
        }
    }

    // int row, col;
    // ArrayList<int[]> list;
    // boolean[][] isVisited;
    // boolean flag = false;
    // int[] xIncr = {1,-1,0,0};
    // int[] yIncr = {0,0,1,-1};
    // private void helper(char[][] board, int i, int j){
    //     if(!isVisited[i][j]){
    //         isVisited[i][j] = true;
    //         if(board[i][j]=='O'){
    //             list.add(new int[]{i,j});
    //             if(i * j == 0 || i==row-1 || j==col-1) flag = true;
    //             for(int k = 0; k < 4; k++){
    //                 int x = i + xIncr[k];
    //                 int y = j + yIncr[k];
    //                 if(x>=0 && x<row && y>=0 && y<col){
    //                     helper(board, x, y);
    //                 }
    //             }
    //         }
    //     }
    // }
}
// @lc code=end

