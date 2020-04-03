import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=594 lang=java
 *
 * [594] 最长和谐子序列
 */

// @lc code=start
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int max = 0;
        int num;
        for(Integer i : map.keySet()){
            if(map.containsKey(i+1)){
                num = map.get(i)+map.get(i+1);
                if(num>max) max = num;
            }
        }
        return max;
    }
}
// @lc code=end

