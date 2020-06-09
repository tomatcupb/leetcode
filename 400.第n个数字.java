/*
 * @lc app=leetcode.cn id=400 lang=java
 *
 * [400] 第N个数字
 */

// @lc code=start
class Solution {
    public int findNthDigit(int n) {
        // 注意用long，否则可能溢出
        long sum = 0;
        int len = 0; // len: 位数
        while(sum<n){
            sum += Math.pow(10, len)*(len +1)*9;
            len++;
        }

        // 找到len-1位数的最后一个索引
        sum -= (Math.pow(10, len - 1)* len * 9);
        // p: len位数的第几个，索引从1开始
        // q: 在这位数中的索引
        int p = (int)(n-sum-1)/ len, q = (int)(n-sum-1)% len;
        int num = (int)Math.pow(10, len -1)+p;
        return String.valueOf(num).charAt(q)-'0';
    }
}
// @lc code=end

