/*
 * @lc app=leetcode.cn id=852 lang=java
 *
 * [852] 山脉数组的峰顶索引
 */

// @lc code=start
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        // for(int i = 1; i<A.length; i++){
        //     if(A[i]>A[i-1]&& A[i]>A[i+1]){
        //         return i;
        //     }
        // }
        // return -1;

        int left = 0;
        int right = A.length-1;
        while(left<=right){
            int mid = (left+right)>>>1;
            if(A[mid]>A[mid-1] && A[mid]>A[mid+1]){
                return mid;
            } else if(A[mid]>=A[mid-1] && A[mid]<=A[mid+1]){
                left = mid+1;
            } else if(A[mid]<=A[mid-1] && A[mid]>=A[mid+1]){
                right = mid-1;
            }
        }
        return -1;
    }
}
// @lc code=end

