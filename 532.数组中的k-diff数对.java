import java.util.Arrays;
/*
 * @lc app=leetcode.cn id=532 lang=java
 *
 * [532] 数组中的K-diff数对
 */

// @lc code=start
class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = 1;
        int diff;
        while(left<nums.length && right <nums.length){
            if(left==right){
                right++;
                continue;
            }
            diff = nums[right] - nums[left];
            if(diff==k){
                count++;
                int index = left+1;
                while(index<nums.length && nums[left]==nums[index]){
                    index++;
                }
                left = index;
                index =right+1;
                while(index<nums.length && nums[right]==nums[index]){
                    index++;
                }
                right = index;
            } else if(diff<k){
                int index = right+1;
                while(index<nums.length && nums[right]==nums[index]){
                    index++;
                }
                right = index;
            } else{
                int index = left+1;
                while(index<nums.length && nums[left]==nums[index]){
                    index++;
                }
                left = index;
            }
        }
        return count;
    }
}
// @lc code=end

