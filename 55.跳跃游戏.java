/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        // 1. 递归+记忆化搜索效率较低（828ms）
        // 1) 单点到达判断：nums[i]+i>=index，则index可达，据此递归
        // 2) 递归单点判断过程
        // int[] dis = new int[nums.length];
        // for(int i = 0; i< nums.length; i++){
        //     dis[i] = nums[i] + i;
        // }
        // memo = new boolean[nums.length];
        // isVisited = new boolean[nums.length];

        // return helper(nums, dis, nums.length-1);

        // 2. dp(913ms)
        // int len = nums.length;
        // boolean[] dp = new boolean[len];
        // dp[0] = true;
        // for(int i = 1; i<len; i++){
        //     for(int j = i-1; j>=0; j--){
        //         if(dp[j]==true && nums[j]+j>=i) dp[i] = true;
        //     }
        // }
        // return dp[len-1];

        // 3. 贪心(3ms)
        // 遍历数组，记录能到达的最右距离rightMost
        // int rightMost = 0;
        // int len = nums.length;
        // for(int i = 0; i<len; i++){
        //     if(i>rightMost) return false;
        //     rightMost = Math.max(rightMost, nums[i]+i);
        //     if(rightMost>=len-1) return true;
        // }
        // return false;

        // 4. 特殊解法(1ms)
        int n = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            n = nums[i] >= n? 1 : n+1;
            if (i == 0 && n > 1) return false;
        }
        return true;
    }

    // boolean[] memo;
    // boolean[] isVisited;
    // private boolean helper(int[] nums, int[] dis, int lastIndex){
    //     if(lastIndex == 0) return true;
    //     for(int i = 0; i< lastIndex; i++){
    //         if(memo[lastIndex]==true) return true;
    //         if(isVisited[lastIndex]==true && memo[lastIndex]==false) return false;
    //         if(dis[i]>=lastIndex && helper(nums, dis, i)){
    //             isVisited[lastIndex] = true;
    //             memo[lastIndex] = true;
    //             return true;
    //         }
    //     }
    //     isVisited[lastIndex] = true;
    //     return false;
    // }
}
// @lc code=end

