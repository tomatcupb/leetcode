/*
 * @lc app=leetcode.cn id=494 lang=java
 *
 * [494] 目标和
 */

// @lc code=start
class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        // 1. 暴力回溯超时
        // backtrack(nums, S, 0, 0, 0);
        // return ans;


        // 2. dp
        /**
         * sum(P)+sum(N)=S
         * sum(P)-sum(N)=sum
         * 2*sum(P)=S+sum
         * sum(P)=(S+sum)/2
         * 等价于在nums种找到和为(S+sum)/2的子数组
         */
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        if((S+sum)%2==1 || sum<S) return 0;
        int target = (S+sum)/2;
        int len = nums.length;
        // (二维数组81.45%，6.67%)
        // int[][] dp = new int[len+1][target+1];
        // dp[0][0] = 1;
        // for(int i = 1; i< len+1;i++){
        //     for(int j = 0; j< target+1; j++){
        //         if(nums[i-1]>j){
        //             dp[i][j]=dp[i-1][j];
        //         } else{
        //             dp[i][j] = dp[i-1][j]+dp[i-1][j-nums[i-1]];
        //         }
        //     }
        // }
        // return dp[len][target];

        // (一维数组99.97%, 6.67%)
        int[] dp = new int[target + 1]; 
        dp[0] = 1;
        for (int n : nums)
            for (int i = target; i >= n; i--)
                dp[i] += dp[i - n]; 
        return dp[target];
    }

    // int ans = 0;
    // private void backtrack(int[] nums, int S, int sum, int start, int count){
    //     if(count==nums.length){
    //         if(sum==S) ans++;
    //         return;
    //     }
    //     for(int i = start; i< nums.length; i++){
    //         backtrack(nums, S, sum+nums[i], i+1, count+1);
    //         backtrack(nums, S, sum-nums[i], i+1, count+1);
    //     }
    // }
}

// @lc code=end

