import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=784 lang=java
 *
 * [784] 字母大小写全排列
 */

// @lc code=start

// 
class Solution {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();
        helper(ans, S, 0);
        return ans;
    }

    private void helper(List<String> ans, String s, int start){
        if(start == s.length()-1){
            ans.add(s);
            return;
        }

        for(int i = start; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                helper(ans, s, i+1);
                StringBuilder sb = new StringBuilder(s);
                sb.replace(i, i+1, String.valueOf((char)(s.charAt(i)+'A'-'a')));
                helper(ans, sb.toString(), i+1);
            }
        }
    }
}
// @lc code=end

