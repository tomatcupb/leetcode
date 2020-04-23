/*
 * @lc app=leetcode.cn id=209 lang=java
 *
 * [209] 长度最小的子数组
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        // 1. 双指针滑动窗口
        int len = nums.length;
        int left = 0;
        int right = 0;
        int sum = 0;
        int ans = 0;
        for(right = 0; right< len; right++){
            sum += nums[right];
            while(sum>=s){
                ans = ans==0?(right-left+1):Math.min(ans, right-left+1);
                sum -= nums[left++];
            }
        }
        return ans;
    }
}
// @lc code=end

