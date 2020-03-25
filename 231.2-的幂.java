/*
 * @lc app=leetcode.cn id=231 lang=java
 *
 * [231] 2的幂
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1){
            return true;
        }

        if(n%2 != 0 || n == 0){
            return false;
        } else{
            return isPowerOfTwo(n/2);
        }
    }
}
// @lc code=end

