/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)){
            return false;
        } else{
            // int len = (x+"").length();
            int sum = 0;
            // int quotient;
            // int remainder;
            int origin = x;
            // for(int i = len; i>0; i--){
            //     quotient = x / (int)Math.pow(10, i-1);
            //     remainder = x % (int)Math.pow(10, i-1);
            //     sum = sum + quotient * (int)Math.pow(10, len-i);
            //     x = remainder;
            // }
            while(x!=0){
                sum = sum * 10 + (x % 10);
                x /= 10;
            }
            return sum==origin?true:false;      
        }
    }
}
// @lc code=end

