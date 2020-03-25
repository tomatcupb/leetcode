/*
 * @lc app=leetcode.cn id=724 lang=java
 *
 * [724] 寻找数组的中心索引
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0) return -1;
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
        }
        int p = 0;
        int sumLeft = 0;
        int sumRight = sum;
        while(p<nums.length){
            sumRight -= nums[p];
            if(sumLeft == sumRight){
                return p;
            } else{
                sumLeft += nums[p];
                p++;
            }
        }
        return -1;
    }
}
// @lc code=end

