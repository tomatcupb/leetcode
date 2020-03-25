import java.util.ArrayList;
import java.util.List;
/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backTrack(ans, "", 0, 0, n);
        return ans;
    }

    private void backTrack(List<String> list,String str, int leftNum, int rightNum, int max){
        if(str.length()==max*2){
            list.add(str);
            return;
        }

        if(leftNum<max){
            backTrack(list, str+"(", leftNum+1, rightNum, max);
        }
        if(rightNum<leftNum){
            backTrack(list, str+")", leftNum, rightNum+1, max);
        }
    }

    

}
// @lc code=end

