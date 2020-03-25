/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-1;
        while(i>= 1 && nums[i]<=nums[i-1]){
            i--;
        }
        if(i>0){
            int j = nums.length-1;
            while(j>=i){
                if(nums[j]>nums[i-1]){
                    swap(nums, i-1, j);
                    break;
                }
                j--;
            }
        }
        reverse(nums, i);
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    private void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length-1;
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
// @lc code=end

