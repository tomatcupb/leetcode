/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        int curMax = 0;
        int preMax = 0;
        for(int num : nums){
            int temp = curMax;
            curMax = Math.max(curMax, preMax+num);
            preMax = temp;
        }
        return curMax;
    }
}
// @lc code=end

