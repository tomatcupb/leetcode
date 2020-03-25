/*
 * @lc app=leetcode.cn id=896 lang=java
 *
 * [896] 单调数列
 */

// @lc code=start
class Solution {
    public boolean isMonotonic(int[] A) {
        if(A==null || A.length == 0) return false;
        if(A[0]==A[A.length-1]){
            for(int i = 1; i< A.length; i++){
                if(A[i-1]!=A[i]) return false;
            }
        } else if(A[0]>A[A.length-1]){
            for(int i = 1; i< A.length; i++){
                if(A[i-1]<A[i]) return false;
            }
        } else{
            for(int i = 1; i< A.length; i++){
                if(A[i-1]>A[i]) return false;
            }
        }
        return true;
    }
}
// @lc code=end

