import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=840 lang=java
 *
 * [840] 矩阵中的幻方
 */

// @lc code=start
class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        if(row < 3 || col <3) return 0;
        List<int[]> list = new ArrayList<>();
        for(int i = 1; i< row-1; i++){
            for(int j = 1; j<col-1; j++){
                if(grid[i][j]==5) list.add(new int[]{i,j});
            }
        }

        int ans = 0;
        for(int[] nums : list){
            if(helper(grid, nums[0], nums[1])) ans++;
        }
        return ans;

    }

    private boolean helper(int[][] grid, int i, int j){
        int one = grid[i-1][j-1], two = grid[i-1][j], three= grid[i-1][j+1],
        four = grid[i][j-1], five = grid[i][j],six = grid[i][j+1],
        seven = grid[i+1][j-1], eight = grid[i+1][j], nine = grid[i+1][j+1];

        for(int m = i-1; m<i+2; m++){
            int sum = 0;
            for(int n = j-1; n<j+2; n++){
                sum += grid[m][n];
            }
            if(sum!=15) return false;
        }

        for(int m = j-1; m<j+2; m++){
            int sum = 0;
            for(int n = i-1; n<i+2; n++){
                sum += grid[n][m];
            }
            if(sum!=15) return false;
        }

        if(one+five+nine!=15 || three+five+seven!=15) return false;

        int[] nums = {one,two, three, four, five, six, seven, eight, nine};
        Arrays.sort(nums);
        if(!Arrays.toString(nums).equals("[1, 2, 3, 4, 5, 6, 7, 8, 9]")) return false;
        return true;
    }
}
// @lc code=end

