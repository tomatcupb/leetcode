/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        int temp = x^y;
        int sum = 0;
        while(temp > 0){
            // sum += temp % 2;
            // temp = temp/2;
            sum += temp&1;
            temp = temp >> 1;
        }
        return sum;
    }
}
// @lc code=end

