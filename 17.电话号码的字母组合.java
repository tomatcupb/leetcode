import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String[]> map= new HashMap<>();
        map.put('2', new String[]{"a","b","c"});
        map.put('3', new String[]{"d","e","f"});
        map.put('4', new String[]{"g","h","i"});
        map.put('5', new String[]{"j","k","l"});
        map.put('6', new String[]{"m","n","o"});
        map.put('7', new String[]{"p","q","r","s"});
        map.put('8', new String[]{"t","u","v"});
        map.put('9', new String[]{"w","x","y","z"});

        String[] ans = new String[0];
        for(int i = 0; i< digits.length(); i++){
            ans = concatString(ans,map.get(digits.charAt(i)));
        }
        List<String> res = new ArrayList<>();
        for(String str : ans){
            res.add(str);
        }
        return res;
    }

    private String[] concatString(String[] a, String[] b){
        if(a.length==0) return b;
        String[] ans = new String[a.length*b.length];
        int count = 0;
        for(String str:a){
            for(String s:b){
                StringBuilder sb = new StringBuilder();
                sb.append(str).append(s);
                ans[count++] = sb.toString();
            }
        }
        return ans;
    }
}
// @lc code=end

