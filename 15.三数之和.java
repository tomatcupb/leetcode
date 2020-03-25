import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(nums.length<3) return ans;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2;i++){
            if(i == 0 || nums[i]!=nums[i-1]){
                int left = i+1;
                int right = nums.length-1;
                while(left<right){
                    int sum = nums[i]+nums[left]+nums[right];
                    if(sum==0){
                        ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        while(left<right && nums[left] == nums[left+1]) left++;
                        while(left<right && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    } else if(sum>0){
                        while(left<right && nums[right] == nums[right-1]) right--;
                        right--;
                    } else{
                        while(left<right && nums[left] == nums[left+1]) left++;
                        left++;
                    }
                }
            }
        }
        return ans;
    }
}
// @lc code=end

