import java.util.Arrays;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> strMap = new HashMap<>();
        String[] strs = str.split(" ");
        if(pattern.length() != strs.length){
            return false;
        }
        for(int i = 0; i<pattern.length(); i++){
            if(strMap.containsKey(pattern.charAt(i))){
                if(!strs[i].equals(strMap.get(pattern.charAt(i)))){
                    return false;
                }
            } else if(strMap.containsValue(strs[i])){
                return false;
            } else {
                strMap.put(pattern.charAt(i), strs[i]);
            } 
        }
        return true;
    }
}
// @lc code=end

