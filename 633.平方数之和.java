/*
 * @lc app=leetcode.cn id=633 lang=java
 *
 * [633] 平方数之和
 */

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
        int root = (int)Math.sqrt(c);
        int left = 0;
        int right = root;
        int sum;
        while(left<=right){
            sum = left*left+right*right;
            if(sum > c){
                right --;
            } else if(sum<c){
                left ++;
            } else{
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

