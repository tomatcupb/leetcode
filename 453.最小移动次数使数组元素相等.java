import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=453 lang=java
 *
 * [453] 最小移动次数使数组元素相等
 */

// @lc code=start
class Solution {
    public int minMoves(int[] nums) {
        int moves = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            moves += nums[i];
            min = Math.min(min, nums[i]);
        }
        return moves - min*nums.length;
    }
}
// @lc code=end

