/*
 * @lc app=leetcode.cn id=169 lang=java
 *
 * [169] 多数元素
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        //摩尔投票法
        int count =0;
        Integer candidate = null;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count = candidate == num? count+1:count-1;
        }
        return candidate;
    }
}
// @lc code=end

