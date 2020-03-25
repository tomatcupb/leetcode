/*
 * @lc app=leetcode.cn id=35 lang=java
 *
 * [35] 搜索插入位置
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {


        // for(int i = 0; i< nums.length-1; i++){
        //     if(nums[i]<target && nums[i+1] >= target){
        //         return i+1;
        //     }
        // }

        // if(target>nums[nums.length-1]){
        //     return nums.length;
        // } else if(target==nums[nums.length-1]){
        //     return nums.length-1; 
        // } else{
        //     return 0;
        // }

        for(int i=0; i< nums.length; i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;


    }
}
// @lc code=end

