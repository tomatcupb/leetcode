/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i<dp.length; i++){
            dp[i] = Math.max(nums[i], dp[i-1]+nums[i]);
            if(dp[i]>max) max = dp[i];
        }
        return max;
    }
}
// @lc code=end

