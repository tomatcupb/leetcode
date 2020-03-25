import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0) return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        int k = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                nums1[k++] = nums1[i];
                i++;
                j++;
            } else if(nums1[i]<nums2[j]){
                i ++;
            } else{
                j ++;
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}
// @lc code=end

