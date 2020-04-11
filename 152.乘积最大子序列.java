/*
 * @lc app=leetcode.cn id=152 lang=java
 *
 * [152] 乘积最大子序列
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int product = 1;
        for(int i:nums){
            product *= i;
            if(max<product) max = product;
            if(i==0) product = 1;
        }
        product = 1;
        for(int i = nums.length-1; i>=0; i--){
            product *= nums[i];
            if(max<product) max = product;
            if(nums[i]==0) product = 1;
        }
        return max;
    }
}
// @lc code=end

