import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = target-Integer.MAX_VALUE;
        for(int i = 0;i<nums.length-2; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(Math.abs(sum-target)<Math.abs(ans-target)){
                    ans = sum;
                }
                if(sum<target){
                    left++;
                }else if(sum>target){
                    right --;
                }else{
                    return sum;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

