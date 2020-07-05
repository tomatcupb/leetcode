import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        if(row==0) return ans;
        int col = matrix[0].length;
        int total = row*col;
        int i = 0, j = 0, dir = 0;
        boolean[][] isVisted = new boolean[row][col];
        // 方向变化右下左上
        int[] xIncr = {0,1,0,-1};
        int[] yIncr = {1,0,-1,0};
        for(int k = 0; k< total; k++){
            ans.add(matrix[i][j]);
            isVisted[i][j] = true;
            int tmpI = i+xIncr[dir];
            int tmpJ = j+yIncr[dir];
            if(tmpI<0 || tmpI==row || tmpJ<0 || tmpJ==col || isVisted[tmpI][tmpJ]){
                dir = dir==3?0:dir+1;
                tmpI = i+xIncr[dir];
                tmpJ = j+yIncr[dir];
            }
            i = tmpI;
            j = tmpJ;
        }
        return ans;
    }
}
// @lc code=end

