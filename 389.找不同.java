/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int add = 0;
        for(char c:sChars){
            add = add^c;
        }
        for(char c:tChars){
            add = add^c;
        }
        return (char)add;
    }
}
// @lc code=end

