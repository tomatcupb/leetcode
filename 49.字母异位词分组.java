import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // List<List<String>> ans = new ArrayList<>();
        int len = strs.length;
       
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i< len; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String s =  String.valueOf(chars);
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }

        // for(String key: map.keySet()){
        //     List<String> list = map.get(key);
        //     ans.add(list);
        // }
        // return ans;

        return new ArrayList<>(map.values());
    }
}
// @lc code=end

