/*
 * @lc app=leetcode.cn id=941 lang=java
 *
 * [941] 有效的山脉数组
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length<3 || A[0]>A[1]){
            return false;
        }
        int peak = A.length-2;
        loop:
        for(int i =0; i<A.length-2; i++){
            if(A[i]==A[i+1]){
                return false;
            }
            if(A[i]>A[i+1]){
                peak = i;
                break loop;
            }
        }
        for(int i = peak; i<A.length-1;i++){
            if(A[i]<=A[i+1]){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

