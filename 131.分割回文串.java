import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<List<String>>();
        backtrack(ans, new LinkedList<>(), 0, s);
        return ans;
    }

    private void backtrack(List<List<String>> ans, LinkedList<String> list, int starIndex,String s){
        if(starIndex==s.length()){
            ans.add(new LinkedList<>(list));
            return;
        }

        for(int i = starIndex+1; i<=s.length(); i++){
            String sub = s.substring(starIndex, i);
            if(isPalindrome(sub)){
                list.add(sub);
                backtrack(ans, list, i, s);
                list.removeLast();
            }
        }

    }

    private boolean isPalindrome(String str){
        if(str.length()<=1) return true;
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)) return false;
            left ++;
            right --;
        }
        return true;
    }
}
// @lc code=end

