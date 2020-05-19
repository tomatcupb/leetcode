/*
 * @lc app=leetcode.cn id=152 lang=java
 *
 * [152] 乘积最大子序列
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        // int max = Integer.MIN_VALUE;
        // int product = 1;
        // for(int i:nums){
        //     product *= i;
        //     max = Math.max(max, product);
        //     if(i==0) product = 1;
        // }
        // product = 1;
        // for(int i = nums.length-1; i>=0; i--){
        //     product *= nums[i];
        //     max = Math.max(max, product);
        //     if(nums[i]==0) product = 1;
        // }
        // return max;

        int max = nums[0];
        int[][] dp = new int[nums.length][2];
        dp[0] = new int[]{nums[0],nums[0]};
        for(int i=1 ; i< nums.length; i++){
            dp[i][0] = Math.max(nums[i], Math.max(dp[i-1][0]*nums[i], dp[i-1][1]*nums[i]));
            dp[i][1] = Math.min(nums[i], Math.min(dp[i-1][0]*nums[i], dp[i-1][1]*nums[i]));
            max = Math.max(dp[i][0], max);
        }
        return max;
    }
}
// @lc code=end

