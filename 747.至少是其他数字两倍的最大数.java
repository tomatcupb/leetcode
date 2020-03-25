import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=747 lang=java
 *
 * [747] 至少是其他数字两倍的最大数
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int first = 0;
        int second = 0;
        for(int i = 0; i< nums.length ; i++){
            if(nums[i]>nums[first]){
                second = first;
                first = i;
            }else if (nums[i]>nums[second] || first == second){
                second = i;
            }
        }
        return nums[second]*2 <= nums[first]?first:-1;
    }
}
// @lc code=end

