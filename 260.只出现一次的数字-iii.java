/*
 * @lc app=leetcode.cn id=260 lang=java
 *
 * [260] 只出现一次的数字 III
 */

// @lc code=start
class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num:nums){
            xor ^=num;
        }
        int bit = 1;
        while((xor&bit)==0){
            bit <<= 1;
        }
        int[] res = new int[2];
        for(int num: nums){
            if((num&bit)==0){
                res[0] = res[0]^num;
            } else{
                res[1] = res[1]^num;
            }
        }
        return res;
    }
}
// @lc code=end

