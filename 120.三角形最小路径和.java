import java.util.List;

/*
 * @lc app=leetcode.cn id=120 lang=java
 *
 * [120] 三角形最小路径和
 */

// @lc code=start
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

    }
    int[] memo;
    int ans = Integer.MAX_VALUE;
    private void backtrackMemo(List<List<Integer>> triangle, int level, int sum){
        if(level == triangle.size()-1){
            if(sum<ans) ans = sum;
            return;
        }
        for(int i = level; i<triangle.size(); i++){
            for(int j = i; j<=i+1; j++){
                backtrackMemo(triangle, level+1, sum+triangle.get(i+1).get(j));
            }
        }

    }
}
// @lc code=end

