/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    //关键是要找出跳出循环的条件
    //递归的做法死循环导致栈溢出 
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        do{
            slow = squareSum(slow);
            fast = squareSum(fast);
            fast = squareSum(fast);
        } while(fast != slow);
        if(fast==1){
            return true;
        }else{
            return false;
        }
    }

    private int squareSum(int n){
        int sum = 0;
        while(n!=0){
            int quotient = n % 10;
            n = n / 10;
            sum = quotient*quotient + sum;
        }
        return sum;
    }
}
// @lc code=end

