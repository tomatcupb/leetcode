import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长上升子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        // 1.dp, o(n2)
        // int len = nums.length;
        // if(len<=1) return len;

        // int[] dp = new int[len];
        // Arrays.fill(dp, 1);
        // int max = 0;
        // for(int i = 1; i<len; i++){
        //     if(nums[i]==nums[i-1]){
        //         dp[i] = dp[i-1];
        //     } else{
        //         for(int j = 0; j< i; j++){
        //             if(nums[j]<nums[i]){
        //                 dp[i] = Math.max(dp[j]+1, dp[i]);
        //             }
        //         }
        //     }
        //     max = Math.max(dp[i], max);
        // }
        // return max;

        // 2. 二分， o(nlogn)
        /**
         * 相当于维护一个结果数组int[] res，
         * 二分查找第一个比当前num大的数
         * 如果当前元素比结果数组的值都大的的话，就追加在结果数组后面（相当于递增序列长度加了1）；
         * 否则的话用当前元素覆盖掉第一个比它大的元素
         * 最终的res应该就是一个最长的递增子序列
         */
        // int[] res = new int[nums.length];
        // int resLen = 0;
        // for(int num : nums){
        //     // 二分，尝试找到第一个比num大的数
        //     int l = 0;
        //     int r = resLen;//res数组中实际放进去的数的个数
        //     while(l<r){
        //         int mid = (l+r)>>1;
        //         if(res[mid]<num){
        //             l = mid+1;
        //         } else{
        //             r = mid;
        //         }
        //     }
        //     res[l] = num;
        //     if(l==resLen) resLen++;
        // }
        // return resLen;

        int[] res = new int[nums.length];
        int len = 0;
        for (int num: nums) {
            // 注意api二分法的写法及返回值
            int idx = Arrays.binarySearch(res, 0, len, num);
            idx = idx < 0? -idx-1: idx;
            res[idx] = num;
            if (idx == len) {
                len++;
            }
        }
        return len;
    }
}
// @lc code=end

