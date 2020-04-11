import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=120 lang=java
 *
 * [120] 三角形最小路径和
 */

// @lc code=start
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // 1. 直接回溯超时
        // backtrack(triangle, 0, 0, 0);
        // return ans;
        

        // 2. 记忆化搜索通过
        // int len = triangle.size();
        // memo = new int[(1+len)*len>>>1];
        // Arrays.fill(memo, Integer.MAX_VALUE);
        // backtrack(triangle, 0, 0);
        // return memo[0];

        // 3. 自下而上动态规划
        // int row = triangle.size();
        // int[][] dp = new int[row][row];
        // for(int i = 0; i<row; i++){
        //     dp[row-1][i] = triangle.get(row-1).get(i);
        // }
        // for(int i = row-2; i>=0; i--){
        //     for(int j = 0; j<=i; j++){
        //         dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i+1][j], dp[i+1][j+1]);
        //     }
        // }
        // return dp[0][0];

        // 4. 自下而上动态规划--覆盖原数组
        for(int i = triangle.size()-2; i>=0; i--){
            for(int j = 0; j<=i; j++){
                triangle.get(i)
                .set(j, triangle.get(i).get(j)+ Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }

    // int ans = Integer.MAX_VALUE;
    // private void backtrack(List<List<Integer>> triangle, int level, int start, int sum){
    //     if(level == triangle.size()){
    //         if(sum<ans) ans=sum;
    //         return;
    //     }
    //     backtrack(triangle, level+1, start, sum+triangle.get(level).get(start));
    //     backtrack(triangle, level+1, start+1, sum+triangle.get(level).get(start));
    // }

    // int[] memo;
    // private int backtrack(List<List<Integer>> triangle, int level, int start){
    //     int index = (1+level)*level/2+start;
    //     if(level == triangle.size()-1){
    //         memo[index] = triangle.get(level).get(start);
    //         return memo[index];
    //     }
    //     if(memo[index]!=Integer.MAX_VALUE){
    //         return memo[index];
    //     }
    //     int res = Math.min(backtrack(triangle, level+1, start), backtrack(triangle, level+1, start+1));
    //     memo[index] = res + triangle.get(level).get(start);
    //     return memo[index];
    // }
}
// @lc code=end

