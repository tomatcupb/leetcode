import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=219 lang=java
 *
 * [219] 存在重复元素 II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numsMap = new HashMap();
        for(int i = 0; i<nums.length; i++){
            if(numsMap.containsKey(nums[i])){
                if(Math.abs(numsMap.get(nums[i]) - i) <= k){
                    return true;
                } else{
                    numsMap.put(nums[i], i);
                }
            } else{
                numsMap.put(nums[i], i);
            }
        }
        return false;
    }
}
// @lc code=end

