import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet<Integer> numSet = new HashSet<Integer>();
        // for(int num : nums){
        //     if(numSet.contains(num)){
        //         return true;
        //     } else{
        //         numSet.add(num);
        //     }
        // }
        // return false;

        Arrays.sort(nums);
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

