/*
 * @lc app=leetcode.cn id=434 lang=java
 *
 * [434] 字符串中的单词数
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        s = s.trim();
        if(s.equals("")) return 0;
        String[] words = s.split("\\s+");
        return words.length;
    }
}
// @lc code=end

