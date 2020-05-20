import java.util.HashMap;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=496 lang=java
 *
 * [496] 下一个更大元素 I
 */

// @lc code=start
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 暴力法：90.06 %， 9.09%
        int len1 = nums1.length, len2 = nums2.length;
        int[] ans = new int[len1];
        for(int i = 0; i < len1; i++){
            int j = 0;
            while(nums2[j]!= nums1[i]) j++;
            while(j<len2 && nums2[j]<= nums1[i]) j++;
            ans[i] = j==len2?-1:nums2[j];
        }
        return ans;
    }
}
// @lc code=end

