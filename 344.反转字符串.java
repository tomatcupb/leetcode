/*
 * @lc app=leetcode.cn id=344 lang=java
 *
 * [344] 反转字符串
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        for(int i=0; i< s.length/2; i++){
            char temp = s[s.length-i-1];
            s[s.length-i-1] = s[i];
            s[i] = temp;
        }
    }
}
// @lc code=end

