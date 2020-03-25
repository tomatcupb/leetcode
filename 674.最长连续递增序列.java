/*
 * @lc app=leetcode.cn id=674 lang=java
 *
 * [674] 最长连续递增序列
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) return 0;
        int tail = 0;
        int head = 0;
        int ans = 1;
        while(tail < nums.length-1){
            if(nums[tail+1]>nums[tail]){
                tail++;
            } else{
                ans = tail-head+1>ans?tail-head+1:ans;
                tail++;
                head = tail;
            }
        }
        return Math.max(ans, tail-head+1);
    }
}
// @lc code=end

