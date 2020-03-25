/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        for(int i = chars.length-1; i>=0; i--){
            if(chars[i]!=' '){
                for(int j = i; j>=0;j--){
                    if(chars[j]==' '){
                        return i-j;
                    }
                }
                return i+1;
            }
        }
        return 0;
    }
}
// @lc code=end

