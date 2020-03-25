import java.util.Arrays;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=506 lang=java
 *
 * [506] 相对名次
 */

// @lc code=start
class Solution {
    public String[] findRelativeRanks(int[] nums) {
        // int[] sorted = Arrays.copyOf(nums, nums.length);
        // Arrays.sort(sorted);

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i<sorted.length; i++){
        //     map.put(sorted[i], sorted.length-i);
        // }

        // String[] ans = new String[nums.length];
        // for(int i = 0; i<nums.length; i++){
        //     if(map.get(nums[i])>3){
        //         ans[i] = String.valueOf(map.get(nums[i]));
        //     } else{
        //         if(map.get(nums[i])==1){
        //             ans[i] = "Gold Medal";
        //         } else if(map.get(nums[i])==2){
        //             ans[i] = "Silver Medal";
        //         } else{
        //             ans[i] = "Bronze Medal";
        //         }
        //     }
        // }
        // return ans;
        
        int max = -1;
        for(int  i = 0; i< nums.length; i++){
            if(nums[i]>max) max = nums[i];
        }

        int[] numsIndex = new int[max+1];
        for(int  i = 0; i< numsIndex.length; i++){
            numsIndex[i] = -1;
        }

        for(int  i = 0; i< nums.length; i++){
            numsIndex[nums[i]] = i;
        }
        
        int rank =1;
        String[] ans = new String[nums.length];
        for(int  i = numsIndex.length-1; i>=0; i--){
            if(numsIndex[i]>-1 && rank<=3){
                if(rank == 1){
                    ans[numsIndex[i]] = "Gold Medal";
                } else if(rank == 2){
                    ans[numsIndex[i]] = "Silver Medal";
                } else{
                    ans[numsIndex[i]] = "Bronze Medal";
                }
                rank++;
            } else if(numsIndex[i]>-1){
                ans[numsIndex[i]] = String.valueOf(rank++);
            }
        }
        return ans;
    }
}
// @lc code=end

