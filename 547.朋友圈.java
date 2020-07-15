/*
 * @lc app=leetcode.cn id=547 lang=java
 *
 * [547] 朋友圈
 */

// @lc code=start
class Solution {
    public int findCircleNum(int[][] M) {
        row = M.length;
        col = M[0].length;
        int count=0;
        isVisted = new boolean[row];
        for(int i = 0; i< row; i++){
            if(!isVisted[i]){
                count++;
                dfs(M, i);
            }
        }
        return count;
    }

    int row, col;
    boolean[] isVisted;
    private void dfs(int[][] M, int i){
        isVisted[i] = true;
        for(int j = 0 ; j<col; j++){
            if(M[i][j]==1 && !isVisted[j]){
                dfs(M, j);
            }
        }
    }
}
// @lc code=end

