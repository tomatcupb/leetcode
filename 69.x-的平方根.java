/*
 * @lc app=leetcode.cn id=69 lang=java
 *
 * [69] x 的平方根
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {
        // for(int i = 1; i<=x; i++){
        //     if(x/i<=i){
        //         return x/i;
        //     }
        // }
        // return x;
        if(x<=1){
            return x;
        }

        int left = 0;
        int right = x;
        while(right-left>1){
            int mid = (left+right)/2;
            if(x/mid<mid){
                right = mid;
            } else{
                left = mid;
            }
        }
        return left;
    }
}
// @lc code=end

