/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        // 栈溢出，300/304 cases passed
        // if(n==0) return 1;
        // if(n>0){
        //     if(n%2==0){
        //         return myPow(x*x, n/2);
        //     } else{
        //         return myPow(x,n-1)*x;
        //     }
        // } else{
        //     return 1/myPow(x, -n);
        // }

        double ans = 1;
        for(int i = n; i!=0; i=i/2){
            if(i%2!=0) ans*=x;
            x *= x;
        }
        return n>0?ans:1/ans;
    }
}
// @lc code=end

