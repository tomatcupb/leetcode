import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        // for(int i = 0; i< nums.length; i++){
        //     if(nums[i] == 0){
        //         loop:
        //         for(int j = i+1; j<nums.length;j++){
        //             if(nums[j]!=0){
        //                 nums[i] = nums[j];
        //                 nums[j] = 0;
        //                 break loop;
        //             }
        //         }
        //     }
        // }

        for(int i=0,count=0;i<nums.length;i++){
            if(nums[i] != 0){
                if(count != i){
                    nums[count] = nums[i];
                    nums[i] = 0;
                }
                count++;
            }
        }
    }
}
// @lc code=end

