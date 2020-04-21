import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=560 lang=java
 *
 * [560] 和为K的子数组
 */

// @lc code=start
class Solution {
    public int subarraySum(int[] nums, int k) {
        // 1. 暴力解法
        // int ans = 0;
        // int sum = k;
        // for(int i = 0; i<nums.length; i++){
        //     int right = i;
        //     while(right<nums.length){
        //         sum -= nums[right];
        //         if(sum==0){
        //             ans++;
        //         }
        //         right++;
        //     }
        //     sum = k;
        // }
        // return ans;

            // 2. 前缀和,两段的sum只差即为k
            // -----------------------------------sum
            // -----------------------map.get(sum-k)
            //                        ------------k
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0, 1);
            int sum = 0;
            int ans = 0;
            for(int i = 0; i< nums.length; i++){
                sum += nums[i];
                if(map.containsKey(sum-k)) ans+=map.get(sum-k);
                map.put(sum, map.getOrDefault(sum, 0)+1);
            }
            return ans;

    }
}
// @lc code=end

