/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        // Time Limit Exceeded
        // if(n<=2){
        //     return n;
        // }
        // return climbStairs(n-1)+climbStairs(n-2);
        
        
        if(n<=2){
            return n;
        }
        int i = 1;
        int j = 2;
        int k = 3;
        int res = 0;
        while(n>=k){
            res = i+j;
            i = j;
            j = res;
            k++;
        }
        return res;
    }
}
// @lc code=end

