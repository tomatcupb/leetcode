/*
 * @lc app=leetcode.cn id=485 lang=java
 *
 * [485] 最大连续1的个数
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int p = 0;
        int count = 0;
        while(p<nums.length){
            if(nums[p] == 1){
                count++;
            } else {
                if(count > max){
                    max = count;
                }
                count = 0;
            }
            p++;
        }
        return count>max?count:max;
    }
}
// @lc code=end

