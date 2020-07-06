/*
 * @lc app=leetcode.cn id=264 lang=java
 *
 * [264] 丑数 II
 */

// @lc code=start
class Solution {
    public int nthUglyNumber(int n) {
        int p2 = 0, p3 = 0, p5 = 0;
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i = 1; i<n; i++){
            // 三指针移动
            // 三个指针分别是代表着下次2要乘的数、3要乘的数、5要乘的数
            // 乘出来的数再进行比较
            ans[i] = Math.min(Math.min(ans[p2]*2, ans[p3]*3), ans[p5]*5);
            if(ans[i]==ans[p2]*2) p2++;
            if(ans[i]==ans[p3]*3) p3++;
            if(ans[i]==ans[p5]*5) p5++;
        }
        // 1也是丑叔
        return ans[n-1];
        /**
         * 1
         * p2
         * p3
         * p5
         * Next = Math.min(2,3,5)
         * 
         * 1    2
         *      p2
         * p3
         * p5
         * Next = Math.min(3,5,4)
         * 
         * 1    2   3
         *      p2
         *      p3
         * p5
         * Next = Math.min(5,4,6)
         * 
         * 1    2   3   4
         *          p2
         *      p3
         * p5
         * Next = Math.min(5,6,6)
         * 
         * 1    2   3   4   5
         *          p2
         *      p3
         *      p5
         * Next = Math.min(6,10,6)
         * 
         * 1    2   3   4   5   6
         *              p2
         *          p3
         *      p5
         * Next = Math.min(10,9,8)
         */
    }
}
// @lc code=end

