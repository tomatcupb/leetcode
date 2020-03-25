/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int sum = 0;
        while(x!=0){
            int temp = x % 10;
            x = x / 10;
            /**
             * 这里的重要思想是：
             * 为了防治溢出，用除法代替乘法的简单但是重要的思路！
             */
            if(sum>Integer.MAX_VALUE/10 || sum<Integer.MIN_VALUE/10){
                return 0;
            }
            sum = sum*10 + temp;
        }
        return sum;
    }
}

// @lc code=end

