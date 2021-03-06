/*
 * @lc app=leetcode.cn id=263 lang=java
 *
 * [263] 丑数
 */

// @lc code=start
class Solution {
    public boolean isUgly(int num) {
        if(num<1) return false;
        while(num%2==0){
            num = num/2;
        }
        while(num%3==0){
            num = num/3;
        }
        while(num%5==0){
            num = num/5;
        }
        return num == 1?true:false;
    }
}
// @lc code=end

