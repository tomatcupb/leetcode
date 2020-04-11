/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int left = 1;
        // int right = num-1>46340?46340:num-1;
        int right = num-1;
        while(left<=right){
            int mid = (left+right)>>>1;
            // if(mid*mid==num) return true;
            if(num/mid==mid && num%mid==0) return true;
            if(num/mid>mid){
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        return false;
    }
}
// @lc code=end

