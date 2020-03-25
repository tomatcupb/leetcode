import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] res = new int[2];
        // outer:
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i+1; j < nums.length; j++){
        //         if(nums[i]+nums[j]==target && i != j){
        //             res[0] = i;
        //             res[1] = j;
        //             break outer;
        //         }
        //     }
        // }
        // return res;

        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        outer:
        for(int i = 0; i < nums.length; i++){
            int dif  = target - nums[i];
            if (map.get(dif) != null){
                res[0] = map.get(dif);
                res[1] = i;
                break outer;
            } else {
                map.put(nums[i], i);
            }
        }
        return res;
    }
}
// @lc code=end

