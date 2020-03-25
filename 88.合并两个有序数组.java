import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // if(m==0){
        //     for(int i = 0; i< n; i++){
        //         nums1[i] = nums2[i];
        //     }
        //     return;
        // }
        // if(n==0){
        //     return;
        // }
        // int p1 = 0;
        // int p2 = 0;
        // int count = 0;
        // while(p2<n){
        //     if(nums1[p1]>nums2[p2]){
        //         count++;
        //         for(int i = m+count-2; i>=p1; i--){
        //             nums1[i+1] = nums1[i];
        //         }
        //         nums1[p1] = nums2[p2];
        //         p2++;
        //         p1++;
        //     } else if(nums2[p2]>=nums1[m+count-1]){
        //         for(int j = 0; j < n-p2; j++){
        //             nums1[m+count+j] = nums2[p2+j];
        //         }
        //         break;
        //     } else{
        //         p1++;
        //     }
        // }
        int p = m-- + n-- -1;
        while(m>=0 && n>=0){
            nums1[p--] = nums1[m]>nums2[n]?nums1[m--]:nums2[n--];
        }
        while (n >= 0) {
            nums1[p--] = nums2[n--];
        }
    }
}
// @lc code=end

