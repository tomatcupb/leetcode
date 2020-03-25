/*
 * @lc app=leetcode.cn id=268 lang=java
 *
 * [268] 缺失数字
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        // int ans = 0;
        // for(int i = 0; i<nums.length; i++){
        //     ans = ans^i^nums[i];
        // }
        // return ans^nums.length;


        // 加法运算还是没有位运算快！
        int ans = 0;
        for(int i = 0; i< nums.length; i++){
            ans = ans - nums[i] + i;
        }
        return ans+nums.length;
    }
}
// @lc code=end

