import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> setRow =  new HashSet<>();
        HashSet<Character> setCol =  new HashSet<>();
        for(int i = 0; i<9; i++){
            setRow.clear();
            setCol.clear();
            for(int j = 0; j< 9; j++){
                if(board[i][j] != '.' && !setRow.add(board[i][j])) return false; 
                if(board[j][i] != '.' && !setCol.add(board[j][i])) return false;
            }
        }

        for(int i = 0; i< 9; i+=3){
            for(int j = 0; j< 9; j+=3){
                setRow.clear();
                for(int m = i; m<i+3; m++){
                    for(int n = j; n<j+3; n++){
                        if(board[m][n] != '.' && !setRow.add(board[m][n])) return false; 
                    }
                }
            }
        }



        return true;
    }
}
// @lc code=end

