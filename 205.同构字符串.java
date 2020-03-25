import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        // HashMap<Character, Character> charsS = new HashMap<Character, Character>();
        // HashMap<Character, Character> charsT = new HashMap<Character, Character>();
        // for(int i = 0; i < s.length(); i++){
        //     if(!charsS.containsKey(s.charAt(i))){
        //         charsS.put(s.charAt(i), t.charAt(i));
        //     }else if(charsS.get(s.charAt(i)) != t.charAt(i)){
        //         return false;
        //     }
        //     if(!charsT.containsKey(t.charAt(i))){
        //         charsT.put(t.charAt(i), s.charAt(i));
        //     }else if(charsT.get(t.charAt(i)) != s.charAt(i)){
        //         return false;
        //     }
        // }

        HashMap<Character, Character> chars = new HashMap<Character, Character>();
        for(int i = 0; i < s.length(); i++){
            if(!chars.containsKey(s.charAt(i))){
                if(chars.containsValue(t.charAt(i))){
                    return false;
                }
                chars.put(s.charAt(i), t.charAt(i));
            }else if(chars.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

