import java.util.ArrayList;
import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=884 lang=java
 *
 * [884] 两句话中的不常见单词
 */

// @lc code=start
class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String s = A+" "+B;
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : s.trim().split(" ")){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        ArrayList<String> list = new ArrayList<>();
        for(String word : map.keySet()){
            if(map.get(word)==1) list.add(word);
        }
        return list.toArray(new String[list.size()]);
    }
}
// @lc code=end

