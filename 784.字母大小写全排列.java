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
        List<StringBuilder> temp =new ArrayList<>();
        temp.add(new StringBuilder());
        for(char c: S.toCharArray()){
            int size = temp.size();
            for(int j = 0; j<size; j++){
                StringBuilder sb = temp.get(j);
                if(Character.isLetter(c)){
                    temp.add(new StringBuilder(sb));
                    sb.append(Character.toUpperCase(c));
                    temp.get(size+j).append(Character.toLowerCase(c));
                } else{
                    sb.append(c);
                }
            }
        }
        List<String> ans =new ArrayList<>();
        for(StringBuilder sb: temp){
            ans.add(sb.toString());
        }
        return ans;
    }
}
// @lc code=end

