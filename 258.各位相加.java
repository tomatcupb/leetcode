/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        while(num>=10){
            num = sumDigits(num);
        }
        return num;
    }

    private int sumDigits(int num){
        int sum = 0;
        while(num!=0){
            sum = sum + num%10;
            num = num/10;
        }
        return sum;
    }
}
// @lc code=end

