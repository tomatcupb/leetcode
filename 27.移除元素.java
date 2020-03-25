/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        // int p = 0;
        // for (int i = 0; i < nums.length; i++) {
        // while (nums[i] != val) {
        // p++;
        // i++;
        // if(i==nums.length){
        // return p;
        // }
        // nums[p] = nums[i];
        // }
        // if(i+1<nums.length){
        // nums[p] = nums[i+1];
        // }else{
        // return p;
        // }
        // }
        // return p;
        // }
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[p] = nums[i];
                p++;
            }
        }
        return p;
    }
}
// @lc code=end
