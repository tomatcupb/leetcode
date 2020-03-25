/*
 * @lc app=leetcode.cn id=371 lang=java
 *
 * [371] 两整数之和
 */

// @lc code=start
class Solution {
    public int getSum(int a, int b) {
        // while(b!=0){
        //     int temp = a;
        //     a = a^b;
        //     b = (temp&b) << 1;
        // }
        // return a;
        return b==0?a:getSum(a^b, (a&b)<<1);
    }
}
// @lc code=end

