/*
 * @lc app=leetcode.cn id=419 lang=java
 *
 * [419] 甲板上的战舰
 */

// @lc code=start
class Solution {
    public int countBattleships(char[][] board) {
        // 修改了原数组
        // int row = board.length;
        // if(row==0) return 0;
        // int col = board[0].length;
        // int ans = 0;
        // for(int i = 0; i<row; i++ ){
        //     for(int j = 0; j<col; j++){
        //         if(board[i][j]=='X'){
        //             ans++;
        //             if(j+1<col && board[i][j+1]=='X'){
        //                 while(j<col && board[i][j]=='X') board[i][j++]='.';
        //             } else{
        //                 int tmp = i;
        //                 while(tmp<row && board[tmp][j]=='X') board[tmp++][j]='.';
        //             }
        //         }
        //     }
        // }
        // return ans;


        // 不修改原数组，o(1)解法
        // 只计数战舰的左上角
        int row = board.length;
        if(row==0) return 0;
        int col = board[0].length;
        int ans = 0;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(board[i][j]=='X' && (i==0 || board[i-1][j]=='.') && (j==0 || board[i][j-1]=='.')){
                    ans ++;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

