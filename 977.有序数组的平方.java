/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] ans = new int[A.length];
        if(A.length==0) return ans;
        int pos = 0;
        while(pos<A.length && A[pos]<0){
            pos++;
        }
        
        int neg = pos-1;
        int index = 0;
        while(pos<A.length && neg>=0){
            if(A[pos]*A[pos]>A[neg]*A[neg]){
                ans[index] = A[neg]*A[neg];
                neg--;
            } else if(A[pos]*A[pos]<A[neg]*A[neg]){
                ans[index] = A[pos]*A[pos];
                pos ++;
            } else{
                ans[index++] = A[pos]*A[pos];
                ans[index] = A[pos]*A[pos];
                neg--;
                pos ++;
            }
            index++;
        }
        if(neg<0){
            for(int i = pos; i<A.length; i++){
                ans[index++] = A[i]*A[i];
            }
        } else if(pos == A.length){
            for(int i = neg; i>=0; i--){
                ans[index++] = A[i]*A[i];
            }
        }
        return ans;
    }   
}
// @lc code=end

