import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(int i = 0; i<s.length(); i++){
        //     char c = s.charAt(i);
        //     map.put(c, map.getOrDefault(c, 0)+1);
        // }
        // for(int i = 0; i<s.length(); i++){
        //     if(map.get(s.charAt(i))==1) return i;
        // }
        // return -1;
        
        char[] chars = new char[26];
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            chars[c-'a'] ++;
        }
        for(int i = 0; i<s.length(); i++){
            if(chars[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
// @lc code=end

