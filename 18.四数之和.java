import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (nums.length < 4) return ans;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    if (j == i + 1 || nums[j] != nums[j - 1]) {
                        int left = j + 1;
                        int right = nums.length - 1;
                        while (left < right) {
                            int sum = nums[i] + nums[j] + nums[left] + nums[right];
                            if (sum == target) {
                                ans.add(Arrays.asList(nums[i],nums[j],nums[left], nums[right]));
                                while(left<right && nums[left]==nums[left+1]) left++; 
                                while(left<right && nums[right]==nums[right-1]) right--;
                                left ++;
                                right --;  
                            } else if (sum > target) {
                                while(left<right && nums[right]==nums[right-1]) right--;
                                right--;
                            } else {
                                while(left<right && nums[left]==nums[left+1]) left++;
                                left++;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }
}
// @lc code=end
