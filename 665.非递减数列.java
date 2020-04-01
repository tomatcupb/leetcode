/*
 * @lc app=leetcode.cn id=665 lang=java
 *
 * [665] 非递减数列
 */

// @lc code=start
class Solution {
    public boolean checkPossibility(int[] nums) {
        if(nums.length<=2) return true;
        int i;
        boolean flag = true;
        for(i = 0; i< nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                if(flag){
                    if(i>0 && nums[i-1]>nums[i+1]){
                        nums[i+1] = nums[i];
                    } else{
                        nums[i] = nums[i+1];
                    }
                    flag = false;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

