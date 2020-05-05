/*
 * @lc app=leetcode.cn id=29 lang=java
 *
 * [29] 两数相除
 */

// @lc code=start
class Solution {
    // 泰勒展开
    // x = a0*2^0+a1*2^1+a2*2^2+...an*2^n
    public int divide(int dividend, int divisor) {
        if(divisor==0) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int ans = 0;
        boolean flag = (dividend^divisor)>=0;
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        for(int i = 31; i>=0; i--){
            if(a>>i>=b){
                ans += 1<<i;
                a -= (b<<i);
            }
        }
        return flag?ans:-ans;
    }
}
// @lc code=end

