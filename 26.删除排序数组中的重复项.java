/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <=1){
            return nums.length;
        }
        int p = 1;
        for(int i = 1; i< nums.length; i++){
            while(nums[i]==nums[i-1]){
                i++;
                if(i== nums.length){
                    return p;
                }
            }
            nums[p] = nums[i];
            p++;
        }
        return p;
    }
}
// @lc code=end

