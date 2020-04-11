/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        // 1. 利用数组空间动态规划
        // int len = nums.length;
        // if(len==0) return 0;
        // if(len==1) return nums[0];
        // if(len == 2) return Math.max(nums[0], nums[1]);
        // int[] dp =new int[len-1];
        // dp[0] = nums[0];
        // dp[1] = Math.max(dp[0], nums[1]);
        // for(int i = 2; i<len-1; i++){
        //     dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        // }
        // int max = dp[len-2];
        // dp[0] = nums[1];
        // dp[1] = Math.max(nums[1], nums[2]);
        // for(int i = 3; i<=len-1; i++){
        //     dp[i-1] = Math.max(dp[i-2], dp[i-3]+nums[i]);
        // }
        // return Math.max(max, dp[len-2]);

        // 2. 用两个变量存储前边的两个值就可以,节省空间
        int len = nums.length;
        if(len==0) return 0;
        if(len==1) return nums[0];
        if(len == 2) return Math.max(nums[0], nums[1]);
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        for(int i = 2; i<len-1; i++){
            int temp = Math.max(first+nums[i], second);
            first = second;
            second = temp;
        }
        int max = second;
        first = nums[1];
        second = Math.max(first, nums[2]);
        for(int i = 3; i<len; i++){
            int temp = Math.max(first+nums[i], second);
            first = second;
            second = temp;
        }
        return Math.max(second, max);
    }
}
// @lc code=end

