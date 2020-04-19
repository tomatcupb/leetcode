/*
 * @lc app=leetcode.cn id=137 lang=java
 *
 * [137] 只出现一次的数字 II
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        /**
         * 0 ^ x = x,
         * x ^ x = 0；
         * x & ~x = 0,
         * x & ~0 =x;
         */
        int first = 0, second = 0;
        for(int num : nums){
            first = ~second & (first ^ num);
            second = ~first & (second ^ num);
        }
        return first;
    }
}
// @lc code=end

