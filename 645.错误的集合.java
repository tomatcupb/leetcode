/*
 * @lc app=leetcode.cn id=645 lang=java
 *
 * [645] 错误的集合
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length;
        int sum = (1+len)*len/2;
        int sum2 = 0;
        int[] res = new int[2];
        for(int i = 0 ;i<len; i++){
            sum2 += (int)Math.abs(nums[i]);
            nums[(int)Math.abs(nums[i])-1] = -Math.abs(nums[(int)Math.abs(nums[i])-1]);
        }
        for(int i = 0; i< len ;i++){
            if(nums[i]>0){
                res[1] = i+1;
                break;
            }
        }
        res[0] = res[1] + sum2 - sum;
        return res;
    }
}
// @lc code=end

