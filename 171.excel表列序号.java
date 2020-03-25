/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        int sum = 0;
        for(int i = 0; i< s.length(); i++){
            sum = sum*26+ s.charAt(i)-64;
        }
        return sum;
    }
}
// @lc code=end

