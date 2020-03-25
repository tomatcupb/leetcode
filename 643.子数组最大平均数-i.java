/*
 * @lc app=leetcode.cn id=643 lang=java
 *
 * [643] 子数组最大平均数 I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        if(k>len){
            return -1;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<=len-k; i++){
            int sum = 0;
            for(int j = 0; j<k; j++){
                sum += nums[i+j];
            }
            if(sum>max){
                max = sum;
            }
        }
        return (max+0.0)/k;
    }
}
// @lc code=end

