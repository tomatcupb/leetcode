import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        if(word.equals("")) return true;
        if(board.length == 0) return false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(backtrack(word, 0, board, visited, i, j)) return true;
            }
        }
        return false;
    }

    private boolean backtrack(String word, int index, char[][] board, boolean[][] visited, int i, int j){
        if(visited[i][j]==false && index == word.length()-1 && board[i][j] == word.charAt(index)) return true;
        if(visited[i][j]==false && board[i][j] == word.charAt(index)){
            visited[i][j] = true;
            ++index;
            if(i+1<board.length && backtrack(word, index, board, visited, i+1, j)){
                return true;
            } 
            if(j+1<board[0].length && backtrack( word, index, board, visited, i, j+1)){
                return true;
            } 
            if(i-1>=0 && backtrack(word, index, board, visited, i-1, j)){
                return true;
            } 
            if(j-1>=0 && backtrack(word, index, board, visited, i, j-1)){
                return true;
            }
            visited[i][j] = false;
        }
        return false;
    }
}
// @lc code=end

