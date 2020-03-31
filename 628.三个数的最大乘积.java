import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=628 lang=java
 *
 * [628] 三个数的最大乘积
 */

// @lc code=start
class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[len-1]*nums[len-2]*nums[len-3], nums[len-1]*nums[0]*nums[1]);
    }
}
// @lc code=end

